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

PV = "2.8.8"

RPM_NAME = "ueberzugpp-2.8.8-1.2.aarch64.rpm"
RPM_HASH = "e54548dd00280f513444892d476c98d9f2dae5f65a6d4fdc4179b25d96b29566dbf21fe23cddc4d9f6af669f61774958c7c40787d8af67e66b93ec55928ff2f2"

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
