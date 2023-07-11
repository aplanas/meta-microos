SUMMARY = "Development Environment for CUPS"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains the header files for developing applications \
that want to make use of libcups for adding print support."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-devel-2.4.2-6.1.aarch64.rpm"
RPM_HASH = "cb7a58075c5bdaa8d20f29af4251053dd4c92f33c3d64cf892656b059bef105218dcd7ae642d79ce85420f5bf5d5c940876ba64ef51ff94690105395d97e6f36"

RPROVIDES:${PN} += "cups-devel \
pkgconfig-cups"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups-rpm-helper \
glibc-devel \
libcups2 \
libcupsimage2 \
pkgconfig-avahi-client \
pkgconfig-gnutls"

inherit rpm
