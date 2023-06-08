SUMMARY = "Development files for the DRI API"
DESCRIPTION = "This package contains the development environment required for \
compiling programs and libraries using the DRI API."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "a26d40bc7ca30da408308a645899c1ca560655cdd43e3afbb4a999a9e78da3eac89ac09849b003dd1226159b77f3695a8914ee2a5deed5fadfe8e18652a3aece"

RPROVIDES:${PN} += "Mesa-dri-devel Mesa-dri-devel(aarch-64) pkgconfig(dri)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa pkgconfig(libdrm)"

inherit rpm
