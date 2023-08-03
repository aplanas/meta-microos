SUMMARY = "Development files for the DRI API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs and libraries using the DRI API."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-dri-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "74201f9f06cf102b537c92a715e33a5fc1aadd28b585bc91513772522a77c06a9ef431fd998b1ac017d2135e44b180cf0ef74d2a4c114ab97e07ca809593a403"

RPROVIDES:${PN} += "Mesa-dri-devel \
pkgconfig-dri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa \
pkgconfig-libdrm"

inherit rpm
