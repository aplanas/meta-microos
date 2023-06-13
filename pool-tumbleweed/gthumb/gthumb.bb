SUMMARY = "An Image Viewer and Browser for GNOME"
DESCRIPTION = "gThumb lets you browse your hard disk, showing you thumbnails of image \
files. It also lets you view single files (including GIF animations), \
add comments to images, organize images in catalogs, print images, view \
slide shows, set your desktop background, and more."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "gthumb-3.12.2-3.3.aarch64.rpm"
RPM_HASH = "0a5f58d17e549211835532f79296a212f4117ad9077b2e470131b851b3ebcfc5d414d50cc29d6ecd5aefae96ba44857d030bb71f3ce05e08270d755bd8426faf"

RPROVIDES:${PN} += "application() \
application(org.gnome.gThumb.Import.desktop) \
application(org.gnome.gThumb.desktop) \
gthumb \
gthumb(aarch-64) \
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
libmap_view.so()(64bit) \
liboauth.so()(64bit) \
libphoto_importer.so()(64bit) \
libraw_files.so()(64bit) \
libred_eye_removal.so()(64bit) \
librename_series.so()(64bit) \
libresize_images.so()(64bit) \
libsearch.so()(64bit) \
libselections.so()(64bit) \
libslideshow.so()(64bit) \
libterminal.so()(64bit) \
libwebalbums.so()(64bit) \
metainfo() \
metainfo(org.gnome.gThumb.appdata.xml) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/jxl) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/webp) \
mimehandler(image/x-bmp) \
mimehandler(image/x-ico) \
mimehandler(image/x-pcx) \
mimehandler(image/x-png) \
mimehandler(image/x-tga) \
mimehandler(image/xpm) \
mimehandler(x-content/image-dcf) \
mimehandler(x-content/image-picturecd)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libbrasero-burn3.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libchamplain-0.12.so.0()(64bit) \
libchamplain-gtk-0.12.so.0()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libcolord.so.2()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libheif.so.1()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libraw.so.23()(64bit) \
librsvg-2.so.2()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libwebp.so.7()(64bit) \
libz.so.1()(64bit)"

inherit rpm
