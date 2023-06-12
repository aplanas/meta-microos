SUMMARY = "Free implementation of the GL API"
DESCRIPTION = "The Mesa GL API module is responsible for dispatching all the gl* \
functions. It is intended to be mainly used by the Mesa-libGLES* \
packages."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libglapi0-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "47d371d3774f18a4e33cb1860d583544082d5a1f2bf323784afbecf1bde52873872ae7e263d89c4e29ce591c5fe47808001a5a4a4bb0ad9bdcbc8d3a699d6560"

RPROVIDES:${PN} += "Mesa-libglapi0 \
Mesa-libglapi0(aarch-64) \
libglapi.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
