SUMMARY = "Utility to render images in terminals"
DESCRIPTION = "Überzug++ is a C++ command line utility which allows to draw images \
on terminals by using child windows or using sixel on supported \
terminals. (This is a drop-in replacement for the now defunct \
ueberzug project.) \
 \
Advantages over w3mimgdisplay and ueberzug: \
 \
- support for wayland (sway only) \
- no race conditions as a new window is created to display images \
- 'expose' events will be processed, so that images will be \
  redrawn when switching workspaces \
- tmux support on X11 \
- terminals without the WINDOWID environment variable are supported \
- chars are used as position and size unit \
- A lot of image formats are supported (through opencv and libvips) \
- GIF and animated WEBP support on X11 and Sixel \
- Resized images are cached for faster viewing"
LICENSE = "GPL-3.0"

PV = "2.8.5"

RPM_NAME = "ueberzugpp-2.8.5-1.1.aarch64.rpm"
RPM_HASH = "945d4f5faefa53082035440f31edccbc5d330a3464c8c7f4f9d6b620a4135de3df5985d588e960dc2e4665576dac0a5565324a7a26964cb22460b3700289418b"

RPROVIDES:${PN} += "ueberzugpp \
ueberzugpp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libchafa.so.0()(64bit) \
libcrypto.so.3()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libopencv_core.so.407()(64bit) \
libopencv_imgcodecs.so.407()(64bit) \
libopencv_imgproc.so.407()(64bit) \
libopencv_videoio.so.407()(64bit) \
libsixel.so.1()(64bit) \
libspdlog.so.1.11()(64bit) \
libstdc++.so.6()(64bit) \
libtbb.so.12()(64bit) \
libvips-cpp.so.42()(64bit) \
libvips.so.42()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
