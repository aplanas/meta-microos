SUMMARY = "Image viewer for Sway/Wayland"
DESCRIPTION = "Swayimg is a lightweight image viewer for Wayland display servers. \
 \
In a Sway compatible mode, the viewer creates an 'overlay' above \
the currently active window, which gives the illusion that you are \
opening the image directly in a terminal window."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "swayimg-1.12-1.1.aarch64.rpm"
RPM_HASH = "bd104ded49871f01bebff9646aed4b0f496a9ac6bfc1badbd070bcb3dc80e2f1686b23242669e89d0b592df548fe0316f4ff82580bbf45b4477fbf23bf397d1f"

RPROVIDES:${PN} += "swayimg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenEXRCore-3-1.so.30 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgif.so.7 \
libgobject-2.0.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjson-c.so.5 \
libjxl.so.0.8 \
libpng16.so.16 \
librsvg-2.so.2 \
libtiff.so.6 \
libwayland-client.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libxkbcommon.so.0"

inherit rpm
