SUMMARY = "Image viewer and browser utility"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "pix-2.8.0-1.12.aarch64.rpm"
RPM_HASH = "39bda95b02f67b747c1412daeabfcbcc105679216a2086b69114fd250b0f3fac5257991b70bb0914bd381905b3ef84a684af42f1e10051ba0c05542e9379994a"

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
libfacebook.so \
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
libphotobucket.so \
libpicasaweb.so \
libraw-files.so \
libred-eye-removal.so \
librename-series.so \
libresize-images.so \
libsearch.so \
libselections.so \
libslideshow.so \
libwebalbums.so \
pix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libatk-1.0.so.0 \
libbrasero-burn3.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcogl.so.20 \
libexiv2.so.27 \
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
libjpeg.so.8 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libsecret-1.so.0 \
libsoup-2.4.so.1 \
libsoup-gnome-2.4.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libwebkit2gtk-4.0.so.37 \
libwebp.so.7 \
libz.so.1 \
xapps-common"

inherit rpm
