SUMMARY = "Development tools for docparser"
DESCRIPTION = "The docparser-devel package contains the header files and developer docs for \
docparser."
LICENSE = "GPL-3.0+"

PV = "1.0.1"

RPM_NAME = "docparser-devel-1.0.1-1.7.aarch64.rpm"
RPM_HASH = "62feec7b71b35699980f012d1a0ea3730b757b2ecf1e0ee4c5743a6f51aa1142e9340e40ad9527e6f07bd16b1f34350285e06494e9858c24f2c0c964f0ba4456"

RPROVIDES:${PN} += "docparser-devel docparser-devel(aarch-64) pkgconfig(docparser)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdocparser1"

inherit rpm
