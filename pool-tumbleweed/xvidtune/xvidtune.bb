SUMMARY = "Video mode tuner for the X server"
DESCRIPTION = "xvidtune is a client interface to the X server video mode \
extension (XFree86-VidModeExtension)."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "xvidtune-1.0.4-1.3.aarch64.rpm"
RPM_HASH = "4dd80f3fde62855a20743f29e1d2c7e4534630f26e939c617e21bb0027d775b8d5c7518b388bbc78af15cf2105e2c9800d9e874399cccae572f1778d3ee3a02c"

RPROVIDES:${PN} += "xvidtune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libXxf86vm.so.1 \
libc.so.6"

inherit rpm
