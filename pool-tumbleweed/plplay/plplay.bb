SUMMARY = "Example video player based on libplacebo"
DESCRIPTION = "A small example video player based on libplacebo and FFmpeg. This provides little \
more than the ability to display video files, and rather serves as a tool to \
help understand and demonstrate the various options provided by libplacebo."
LICENSE = "LGPL-2.1-or-later"

PV = "5.264.1"

RPM_NAME = "plplay-5.264.1-1.2.aarch64.rpm"
RPM_HASH = "de061ae47d29f239e0f87d6e8b17217f3032361477cbfb31b408bae4427bc7c05b3df7683c7d460839284052ead8cd4af02568f90a3f12144e5185259745ed3b"

RPROVIDES:${PN} += "plplay \
plplay(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libglfw.so.3()(64bit) \
libm.so.6()(64bit) \
libplacebo.so.264()(64bit)"

inherit rpm
