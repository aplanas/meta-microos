SUMMARY = "GUI frontend for dvdauthor and other related tools"
DESCRIPTION = "DVDStyler is a DVD authoring application for the creation of DVDs. It \
allows not only burning of video files on DVD that can be played on \
standalone DVD players, but also creation of individually designed \
DVD menus. \
Features: \
 \
*creation and burning of DVD video with interactive menus \
*ability to design a custom DVD menu or to select one from the \
 list of ready to use menu templates \
*creation of photo slideshow \
*addition of multiple subtitle and audio tracks \
*support for AVI, MOV, MP4, MPEG, OGG, WMV and other file formats \
*support for MPEG-2, MPEG-4, DivX, Xvid, MP2, MP3, AC-3 and other \
 audio and video formats \
*support for multi-core processors \
*use of MPEG and VOB files without reencoding, see FAQ \
*placement of files with different audio/video format on one DVD \
 (support for titlesets) \
*support for drag & drop \
*flexible menu creation on the basis of scalable vector graphic \
*import of image file for background \
*placement of buttons, text, images and other graphic objects anywhere on \
 the menu screen \
*modification of the font/color and other parameters of buttons \
 and graphic objects \
*scaling of any button or graphic object \
*copy any menu object or whole menu \
*customize navigation using DVD scripting"
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "DVDStyler-3.2.1-2.6.aarch64.rpm"
RPM_HASH = "fd91101178122f8d3ec09903a6382fcf4f2b20919f6817cb68aea34122cdd487434c3f02cb497f4887a16996ebc96030072a3c29ab849c68e683442d743492d3"

RPROVIDES:${PN} += "DVDStyler"

RDEPENDS:${PN} += "dvd+rw-tools \
dvdauthor \
dvdisaster \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libswscale.so.7 \
libudev.so.1 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0 \
libwx-gtk3u-media-suse.so.9.0.0 \
libwxsvg.so.3 \
libwxsvg3 \
mjpegtools \
mkisofs \
wxsvg \
xine-ui"

inherit rpm
