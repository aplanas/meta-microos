SUMMARY = "Development files for libstrophe"
DESCRIPTION = "Development files and headers for libstrophe"
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.12.2"

RPM_NAME = "libstrophe-devel-0.12.2-1.4.aarch64.rpm"
RPM_HASH = "8e866d7e39ef086c5f01c92e6cbdc72791ae97ea2b858f94deae0ac4af0f721f8d7b573d453e102778b894adff25bb8cfabe4c16fc4bc860ddb33664b67256f4"

RPROVIDES:${PN} += "libstrophe-devel \
libstrophe-devel(aarch-64) \
pkgconfig(libstrophe)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstrophe0 \
pkgconfig(libxml-2.0) \
pkgconfig(openssl)"

inherit rpm
