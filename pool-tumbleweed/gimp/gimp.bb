SUMMARY = "The GNU Image Manipulation Program"
DESCRIPTION = "The GIMP is an image composition and editing program, which can be \
used for creating logos and other graphics for Web pages. The GIMP \
offers many tools and filters, and provides a large image \
manipulation toolbox, including channel operations and layers, \
effects, subpixel imaging and antialiasing, and conversions, together \
with multilevel undo. The GIMP offers a scripting facility, but many \
of the included scripts rely on fonts that we cannot distribute."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-2.10.34-4.1.aarch64.rpm"
RPM_HASH = "52fd84e0de79306dc1e9984c44c2dcd9bf3b0f6310f0ec7d8e9bd7cb0cdbf20ba317d5223bf71b092e576a12cd822d80625c1b95c900831a26839b5a38297cd4"

RPROVIDES:${PN} += "config-gimp \
gimp \
gimp-2.0 \
gimp-abi \
gimp-api \
libcolor-selector-cmyk.so \
libcolor-selector-water.so \
libcolor-selector-wheel.so \
libcontroller-linux-input.so \
libcontroller-midi.so \
libdisplay-filter-clip-warning.so \
libdisplay-filter-color-blind.so \
libdisplay-filter-gamma.so \
libdisplay-filter-high-contrast.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libOpenEXR-3-1.so.30 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXmu.so.6 \
libXpm.so.4 \
libasound.so.2 \
libbabl-0-1-0 \
libbabl-0.1.so.0 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgegl-0.4.so.0 \
libgegl-npd-0.4.so \
libgexiv2-2 \
libgexiv2.so.2 \
libgimp-2-0-0 \
libgimp-2.0.so.0 \
libgimpbase-2.0.so.0 \
libgimpcolor-2.0.so.0 \
libgimpconfig-2.0.so.0 \
libgimpmath-2.0.so.0 \
libgimpmodule-2.0.so.0 \
libgimpthumb-2.0.so.0 \
libgimpui-2-0-0 \
libgimpui-2.0.so.0 \
libgimpwidgets-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2-0-0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgs.so.9 \
libgtk-x11-2.0.so.0 \
libgudev-1.0.so.0 \
libharfbuzz.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjson-glib-1.0.so.0 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
liblzma.so.5 \
libm.so.6 \
libmng.so.2 \
libmypaint.so.0 \
libopenjp2.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libpoppler-glib.so.8 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libunwind.so.8 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libz.so.1 \
xdg-utils"

inherit rpm
