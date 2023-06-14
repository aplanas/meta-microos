SUMMARY = "Rawtherapee fork with masks and simplified UI"
DESCRIPTION = "A free, open-source, cross-platform raw image processing program. ART is a derivative of the popular RawTherapee, trading a bit of customization and control over various processing parameters for a simpler and (hopefully) easier to use interface, while still maintaining the power and quality of RawTherapee."
LICENSE = "GPL-3.0-only"

PV = "1.20"

RPM_NAME = "ART-1.20-1.1.aarch64.rpm"
RPM_HASH = "b98d54b050b4f611aa307b7b7eeda5849686362f7dd03c65a4dd95ca380eb8c0930f267cddc4b9cf86a8d21d1079d55c3929571f93b57027cf77ab0c4cd4dd3f"

RPROVIDES:${PN} += "ART \
librtengine.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libexiv2.so.27 \
libexpat.so.1 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libjpeg.so.8 \
liblcms2.so.2 \
liblensfun.so.1 \
libm.so.6 \
libmimalloc.so.2 \
libpangomm-1.4.so.1 \
libpng16.so.16 \
libraw-r.so.23 \
librsvg-2.so.2 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
