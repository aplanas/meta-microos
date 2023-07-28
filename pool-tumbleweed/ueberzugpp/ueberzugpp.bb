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

PV = "2.8.9"

RPM_NAME = "ueberzugpp-2.8.9-1.1.aarch64.rpm"
RPM_HASH = "231eb73f028c7bd9c66744aba49cf16725cd6700291e0b1f82ecb37bea34404ccd9ca87ba3c5405aaf8b75dd65a831ab7bdd7a84cd09f7139d1e62fab748568b"

RPROVIDES:${PN} += "ueberzugpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchafa.so.0 \
libcrypto.so.3 \
libfmt.so.9 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libopencv-core.so.407 \
libopencv-imgcodecs.so.407 \
libopencv-imgproc.so.407 \
libopencv-videoio.so.407 \
libsixel.so.1 \
libspdlog.so.1.12 \
libstdc++.so.6 \
libtbb.so.12 \
libvips-cpp.so.42 \
libvips.so.42 \
libxcb-image.so.0 \
libxcb-res.so.0 \
libxcb.so.1"

inherit rpm
