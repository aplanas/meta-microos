SUMMARY = "Lightweight Gtk+ based image viewer"
DESCRIPTION = "Geeqie is a lightweight image viewer for Linux, BSDs and compatibles."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "geeqie-2.0.1-2.1.aarch64.rpm"
RPM_HASH = "02b7dca2fdcd98cf98099d8245ee362cef0e4cf06770789b59ad740713c68c110b0ea5a79cdcd1ab44741400b5ff3012a456aee8c7b064c99c9fb1f36d722a34"

RPROVIDES:${PN} += "geeqie"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libdjvulibre.so.21 \
libexiv2.so.27 \
libffmpegthumbnailer.so.4 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
liblua5.3.so.5 \
libm.so.6 \
libopenjp2.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpoppler-glib.so.8 \
libraw.so.23 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
update-desktop-files"

inherit rpm
