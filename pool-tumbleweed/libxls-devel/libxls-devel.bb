SUMMARY = "Header files for libxls"
DESCRIPTION = "Development files for libxls."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "libxls-devel-1.6.2-3.6.aarch64.rpm"
RPM_HASH = "2ccfdd14c51ed5b49cca0a67d0355ff53efc6c0825b71d3b724f718c750091e5ae7c9a3991da2131b56d7d4f41acac9c594109a29fa840c153f400109df67c1f"

RPROVIDES:${PN} += "libxls-devel \
pkgconfig-libxls"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxlsreader8"

inherit rpm
