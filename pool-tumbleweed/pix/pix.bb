SUMMARY = "Image viewer and browser utility"
DESCRIPTION = "pix lets you browse your hard disk, showing you thumbnails of \
image files. \
It also lets you view single files (including GIF animations), add \
comments to images, organise images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "pix-2.8.0-1.11.aarch64.rpm"
RPM_HASH = "fcd39d25dfedeb4696b98cceb9720fc91ba84ded4e47940e5d4a815a964e1282fa780df1e4823c3339ec43f45327822b3774fe2a7f5807d39d140059d28ca2d5"

RPROVIDES:${PN} += "application() \
application(pix-import.desktop) \
application(pix.desktop) \
lib23hq.so()(64bit) \
libbookmarks.so()(64bit) \
libburn_disc.so()(64bit) \
libcairo_io.so()(64bit) \
libcatalogs.so()(64bit) \
libchange_date.so()(64bit) \
libcomments.so()(64bit) \
libcontact_sheet.so()(64bit) \
libconvert_format.so()(64bit) \
libdesktop_background.so()(64bit) \
libedit_metadata.so()(64bit) \
libexiv2_tools.so()(64bit) \
libexport_tools.so()(64bit) \
libfacebook.so()(64bit) \
libfile_manager.so()(64bit) \
libfile_tools.so()(64bit) \
libfile_viewer.so()(64bit) \
libfind_duplicates.so()(64bit) \
libflicker.so()(64bit) \
libflicker_utils.so()(64bit) \
libgstreamer_tools.so()(64bit) \
libgstreamer_utils.so()(64bit) \
libimage_print.so()(64bit) \
libimage_rotation.so()(64bit) \
libimage_viewer.so()(64bit) \
libimporter.so()(64bit) \
libjpeg_utils.so()(64bit) \
liblist_tools.so()(64bit) \
liboauth.so()(64bit) \
libphoto_importer.so()(64bit) \
libphotobucket.so()(64bit) \
libpicasaweb.so()(64bit) \
libraw_files.so()(64bit) \
libred_eye_removal.so()(64bit) \
librename_series.so()(64bit) \
libresize_images.so()(64bit) \
libsearch.so()(64bit) \
libselections.so()(64bit) \
libslideshow.so()(64bit) \
libwebalbums.so()(64bit) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/x-bmp) \
mimehandler(image/x-ico) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-tga) \
mimehandler(image/xpm) \
mimehandler(x-content/image-dcf) \
mimehandler(x-content/image-picturecd) \
pix \
pix(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libbrasero-burn3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libcogl.so.20()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
librsvg-2.so.2()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libsoup-gnome-2.4.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libwebp.so.7()(64bit) \
libz.so.1()(64bit) \
xapps-common"

inherit rpm
