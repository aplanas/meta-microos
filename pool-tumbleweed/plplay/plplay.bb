SUMMARY = "Example video player based on libplacebo"
DESCRIPTION = "A small example video player based on libplacebo and FFmpeg. This provides little \
more than the ability to display video files, and rather serves as a tool to \
help understand and demonstrate the various options provided by libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "plplay-5.264.1-1.2.aarch64.rpm"
RPM_HASH = "de061ae47d29f239e0f87d6e8b17217f3032361477cbfb31b408bae4427bc7c05b3df7683c7d460839284052ead8cd4af02568f90a3f12144e5185259745ed3b"

RPROVIDES:${PN} += "plplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libglfw.so.3 \
libm.so.6 \
libplacebo.so.264"

inherit rpm
