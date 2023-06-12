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

RPM_NAME = "DVDStyler-3.2.1-2.5.aarch64.rpm"
RPM_HASH = "a73008c610520015df31d82979720c1e06b962dc3fe741961cc9c51a05b420d29735797b59bd07381cb2a995a3c48a0f50978702d88658a7aa65659cf90219a5"

RPROVIDES:${PN} += "DVDStyler \
DVDStyler(aarch-64) \
application() \
application(dvdstyler.desktop) \
metainfo() \
metainfo(dvdstyler.appdata.xml)"
RDEPENDS:${PN} += "dvd+rw-tools \
dvdauthor \
dvdisaster \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.59()(64bit) \
libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) \
libavformat.so.59()(64bit) \
libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libswscale.so.6()(64bit) \
libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_media-suse.so.9.0.0()(64bit) \
libwx_gtk3u_media-suse.so.9.0.0(WXU_3.2)(64bit) \
libwxsvg.so.3()(64bit) \
libwxsvg3 \
mjpegtools \
mkisofs \
wxsvg \
xine-ui"

inherit rpm
