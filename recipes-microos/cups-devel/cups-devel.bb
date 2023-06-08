SUMMARY = "Development Environment for CUPS"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains the header files for developing applications \
that want to make use of libcups for adding print support."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-devel-2.4.2-4.3.aarch64.rpm"
RPM_HASH = "b194d14d0a79147ac38388726f8a6dc61a4a3db0378dd5efe5bcbb70a099cf4ae821adeb2f17f6b59e9aa6c4bc48904a9db6467db0c582f29466ca40d6e447f1"

RPROVIDES:${PN} += "cups-devel cups-devel(aarch-64) pkgconfig(cups)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cups-rpm-helper glibc-devel libcups2 libcupsimage2 pkgconfig(avahi-client) pkgconfig(gnutls)"

inherit rpm
