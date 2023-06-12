SUMMARY = "Development files for libisds"
DESCRIPTION = "The libisds-devel package contains libraries and header files for \
developing applications that use libisds."
LICENSE = "LGPL-3.0-or-later"

PV = "0.11.2"

RPM_NAME = "libisds-devel-0.11.2-1.4.aarch64.rpm"
RPM_HASH = "462e27a71854aa30774c54050bb7736c90742222190df534f6676d01f8247430ae6be551f269db2188f2edf90ce16e1476014231c0563cb240058d8e611677d8"

RPROVIDES:${PN} += "libisds-devel \
libisds-devel(aarch-64) \
pkgconfig(libisds)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisds5 \
pkgconfig(libcurl) \
pkgconfig(libxml-2.0)"

inherit rpm
