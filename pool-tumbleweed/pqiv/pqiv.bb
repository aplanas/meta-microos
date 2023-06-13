SUMMARY = "Minimalist image viewer"
DESCRIPTION = "pqiv is a powerful GTK 3 based command-line image viewer with a minimal UI. It \
is highly customizable, can be fully controlled from scripts, and has support \
for various file formats including PDF, Postscript, video files and archives. \
It is optimized to be quick and responsive. \
It comes with support for animations, slideshows, transparency, VIM-like key \
bindings, automated loading of new images as they appear, external image \
filters, image preloading, and much more. \
pqiv started as a Python rewrite of qiv avoiding imlib, but evolved into a much \
more powerful tool. Today, pqiv stands for powerful quick image viewer. \
Features: \
 * Command line image viewer \
 * Directory traversing to view whole directories \
 * Watch files and directories for changes \
 * Natural order sorting of the images \
 * A status bar showing information on the current image \
 * Transparency and animation support \
 * Moving, zooming, rotation, flipping \
 * Slideshows \
 * Highly customizable and scriptable \
 * Supports external image filters (e.g. `convert`) \
 * Preloads the next image in the background \
 * Fade between images \
 * Optional PDF/eps/ps support (useful e.g. for scientific plots) \
 * Optional video format support (e.g. for webm animations)"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-2.12-1.4.aarch64.rpm"
RPM_HASH = "6c3a298838a510203ab705c7a47e9480893f07e5ea0622a6aa8bc9c3cefbea71db362ef75ccbe7e1f9e6d16a83efb9659e5795cdc1e278fe61670804695fc797"

RPROVIDES:${PN} += "application() \
application(pqiv.desktop) \
mimehandler(application/pdf) \
mimehandler(application/postscript) \
mimehandler(application/x-cbr) \
mimehandler(application/x-cbz) \
mimehandler(application/x-ext-cbr) \
mimehandler(application/x-ext-cbz) \
mimehandler(application/x-flash-video) \
mimehandler(application/x-navi-animation) \
mimehandler(application/x-pdf) \
mimehandler(application/x-troff-msvideo) \
mimehandler(image/avi) \
mimehandler(image/avs) \
mimehandler(image/bie) \
mimehandler(image/bmp) \
mimehandler(image/cmyk) \
mimehandler(image/dcx) \
mimehandler(image/eps) \
mimehandler(image/fax) \
mimehandler(image/fits) \
mimehandler(image/g3fax) \
mimehandler(image/gif) \
mimehandler(image/gray) \
mimehandler(image/jp2) \
mimehandler(image/jpeg) \
mimehandler(image/jpeg2000) \
mimehandler(image/jpg) \
mimehandler(image/jpx) \
mimehandler(image/miff) \
mimehandler(image/mono) \
mimehandler(image/mtv) \
mimehandler(image/pcd) \
mimehandler(image/pcx) \
mimehandler(image/pdf) \
mimehandler(image/pict) \
mimehandler(image/pjpeg) \
mimehandler(image/png) \
mimehandler(image/ps) \
mimehandler(image/qtif) \
mimehandler(image/rad) \
mimehandler(image/rgba) \
mimehandler(image/rla) \
mimehandler(image/rle) \
mimehandler(image/sgi) \
mimehandler(image/sun-raster) \
mimehandler(image/svg) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/svg-xml) \
mimehandler(image/targa) \
mimehandler(image/tiff) \
mimehandler(image/uyvy) \
mimehandler(image/vid) \
mimehandler(image/viff) \
mimehandler(image/vnd.adobe.svg+xml) \
mimehandler(image/vnd.rn-realpix) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/webp) \
mimehandler(image/x-MS-bmp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-bzeps) \
mimehandler(image/x-compressed-xcf) \
mimehandler(image/x-eps) \
mimehandler(image/x-fits) \
mimehandler(image/x-freehand) \
mimehandler(image/x-gimp-gbr) \
mimehandler(image/x-gimp-gih) \
mimehandler(image/x-gimp-pat) \
mimehandler(image/x-gray) \
mimehandler(image/x-gzeps) \
mimehandler(image/x-icb) \
mimehandler(image/x-icns) \
mimehandler(image/x-ico) \
mimehandler(image/x-icon) \
mimehandler(image/x-ms-bmp) \
mimehandler(image/x-pcx) \
mimehandler(image/x-pict) \
mimehandler(image/x-png) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-ps) \
mimehandler(image/x-psd) \
mimehandler(image/x-psp) \
mimehandler(image/x-quicktime) \
mimehandler(image/x-rgb) \
mimehandler(image/x-sgi) \
mimehandler(image/x-tga) \
mimehandler(image/x-win-bitmap) \
mimehandler(image/x-wmf) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xcursor) \
mimehandler(image/x-xpixmap) \
mimehandler(image/x-xwindowdump) \
mimehandler(image/xpm) \
mimehandler(image/yuv) \
mimehandler(text/xml-svg) \
mimehandler(video/3gp) \
mimehandler(video/3gpp) \
mimehandler(video/avi) \
mimehandler(video/divx) \
mimehandler(video/dv) \
mimehandler(video/fli) \
mimehandler(video/flv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vivo) \
mimehandler(video/vnd.divx) \
mimehandler(video/vnd.mpegurl) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/vnd.vivo) \
mimehandler(video/webm) \
mimehandler(video/x-anim) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-fli) \
mimehandler(video/x-flic) \
mimehandler(video/x-flv) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-mpg) \
mimehandler(video/x-ms-afs) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-asx) \
mimehandler(video/x-ms-wm) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvx) \
mimehandler(video/x-ms-wvxvideo) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora) \
mimehandler(video/x-theora+ogg) \
mimehandler(video/x-totem-stream) \
pqiv \
pqiv(aarch-64)"

RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
