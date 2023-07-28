SUMMARY = "An Image Viewer and Browser for GNOME"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "gthumb-3.12.2-5.1.aarch64.rpm"
RPM_HASH = "2dd6fa17cab8a344401b6e8c74c0e2dadef3efe0b67812fa9fad1d6e8fc6994c493ffff99196c4e5db22927cd5b217aa24b0aeb7750b0b6ea5a30ca47eec0dfe"

RPROVIDES:${PN} += "gthumb \
lib23hq.so \
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
libmap-view.so \
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
libwebalbums.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libbrasero-burn3.so.1 \
libc.so.6 \
libcairo.so.2 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
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
libz.so.1"

inherit rpm
