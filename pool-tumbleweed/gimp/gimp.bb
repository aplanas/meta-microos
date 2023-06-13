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

RPROVIDES:${PN} += "application() \
application(gimp.desktop) \
config(gimp) \
gimp \
gimp(aarch-64) \
gimp(abi) \
gimp(api) \
gimp-2.0 \
libcolor-selector-cmyk.so()(64bit) \
libcolor-selector-water.so()(64bit) \
libcolor-selector-wheel.so()(64bit) \
libcontroller-linux-input.so()(64bit) \
libcontroller-midi.so()(64bit) \
libdisplay-filter-clip-warning.so()(64bit) \
libdisplay-filter-color-blind.so()(64bit) \
libdisplay-filter-gamma.so()(64bit) \
libdisplay-filter-high-contrast.so()(64bit) \
metainfo() \
metainfo(gimp-data-extras.metainfo.xml) \
metainfo(org.gimp.GIMP.appdata.xml) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(image/avif) \
mimehandler(image/bmp) \
mimehandler(image/g3fax) \
mimehandler(image/gif) \
mimehandler(image/heic) \
mimehandler(image/heif) \
mimehandler(image/jp2) \
mimehandler(image/jpeg) \
mimehandler(image/jxl) \
mimehandler(image/openraster) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/webp) \
mimehandler(image/x-compressed-xcf) \
mimehandler(image/x-exr) \
mimehandler(image/x-fits) \
mimehandler(image/x-gimp-gbr) \
mimehandler(image/x-gimp-gih) \
mimehandler(image/x-gimp-pat) \
mimehandler(image/x-icon) \
mimehandler(image/x-pcx) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-psd) \
mimehandler(image/x-psp) \
mimehandler(image/x-sgi) \
mimehandler(image/x-sun-raster) \
mimehandler(image/x-tga) \
mimehandler(image/x-webp) \
mimehandler(image/x-wmf) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xcursor) \
mimehandler(image/x-xpixmap) \
mimehandler(image/x-xwindowdump)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libIex-3_1.so.30()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libasound.so.2()(64bit) \
libbabl-0.1.so.0()(64bit) \
libbabl-0.1.so.0(V0_1_0)(64bit) \
libbabl-0_1-0 \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgegl-0.4.so.0()(64bit) \
libgegl-npd-0.4.so()(64bit) \
libgexiv2-2 \
libgexiv2.so.2()(64bit) \
libgimp-2.0.so.0()(64bit) \
libgimp-2_0-0 \
libgimpbase-2.0.so.0()(64bit) \
libgimpcolor-2.0.so.0()(64bit) \
libgimpconfig-2.0.so.0()(64bit) \
libgimpmath-2.0.so.0()(64bit) \
libgimpmodule-2.0.so.0()(64bit) \
libgimpthumb-2.0.so.0()(64bit) \
libgimpui-2.0.so.0()(64bit) \
libgimpui-2_0-0 \
libgimpwidgets-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libglib-2_0-0 \
libgobject-2.0.so.0()(64bit) \
libgs.so.9()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libheif.so.1()(64bit) \
libjpeg.so.8()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libjxl_threads.so.0.8()(64bit) \
libjxl_threads.so.0.8(JXL_0)(64bit) \
liblcms2.so.2()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libmng.so.2()(64bit) \
libmypaint.so.0()(64bit) \
libopenjp2.so.7()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpoppler-glib.so.8()(64bit) \
librsvg-2.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libunwind.so.8()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit) \
libwmf-0.2.so.7()(64bit) \
libwmflite-0.2.so.7()(64bit) \
libz.so.1()(64bit) \
xdg-utils"

inherit rpm
