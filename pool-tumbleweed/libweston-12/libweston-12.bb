SUMMARY = "Weston rendering backend collection"
DESCRIPTION = "This subpackage contains backend renderer plugins, used by \
libweston-12-0."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.1"

RPM_NAME = "libweston-12-12.0.1-1.2.aarch64.rpm"
RPM_HASH = "94af04efe17b5a0590b30aa685bfd67e18bbba024e68ba16db585d7441251370e81612fa87f733d839b6dd96df17a982a9ecc5d53304f298fbda0b657c305057"

RPROVIDES:${PN} += "libweston-12"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libfreerdp-server2.so.2 \
libfreerdp2.so.2 \
libgbm.so.1 \
libinput.so.10 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libpng16.so.16 \
libseat.so.1 \
libudev.so.1 \
libva-drm.so.2 \
libva.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libwebp.so.7 \
libweston-12.so.0 \
libwinpr2.so.2 \
libxcb-composite.so.0 \
libxcb-render.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
