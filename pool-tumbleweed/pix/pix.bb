SUMMARY = "Image viewer and browser utility"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.2"

RPM_NAME = "pix-3.0.2-1.1.aarch64.rpm"
RPM_HASH = "5be36d67b2f7d3e57459811688ca17fe0b25b45eb7866e4f310bd09959c7c4bfc28b7f175cb350ac6c302eec114f9c0e2837226377124704cc638ce415a396f0"

RPROVIDES:${PN} += "lib23hq.so \
libbookmarks.so \
libburn-disc.so \
libcairo-io.so \
libcatalogs.so \
libchange-date.so \
libcomments.so \
libcontact-sheet.so \
libconvert-format.so \
libdesktop-background.so \
libedit-metadata.so \
libexiv2-tools.so \
libexport-tools.so \
libfile-manager.so \
libfile-tools.so \
libfile-viewer.so \
libfind-duplicates.so \
libflicker-utils.so \
libflicker.so \
libgstreamer-tools.so \
libgstreamer-utils.so \
libimage-print.so \
libimage-rotation.so \
libimage-viewer.so \
libimporter.so \
libjpeg-utils.so \
liblist-tools.so \
liboauth.so \
libphoto-importer.so \
libraw-files.so \
libred-eye-removal.so \
librename-series.so \
libresize-images.so \
libsearch.so \
libselections.so \
libslideshow.so \
libterminal.so \
libwebalbums.so \
pix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libbrasero-burn3.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcolord.so.2 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libraw.so.23 \
librsvg-2.so.2 \
libsecret-1.so.0 \
libsoup-2.4.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libwebkit2gtk-4.0.so.37 \
libwebp.so.7 \
libxapp.so.1 \
libz.so.1"

inherit rpm
