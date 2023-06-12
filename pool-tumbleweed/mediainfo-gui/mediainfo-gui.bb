SUMMARY = "GUI for mediainfo"
DESCRIPTION = "This package contains a Frontend for mediainfo. \
 \
MediaInfo supplies technical and tag information about a video or \
audio file."
LICENSE = "GPL-2.0-or-later"

PV = "23.04"

RPM_NAME = "mediainfo-gui-23.04-1.2.aarch64.rpm"
RPM_HASH = "b7ccb9faf370729a76004c92f92389907a0afd6eda9077809366b42d54c64a984d8a8bc6e83b6406c07c3598c264e2932043c927d9445a1beff20f0b84e2e111"

RPROVIDES:${PN} += "MediaInfo-gui \
application() \
application(mediainfo-gui.desktop) \
mediainfo-gui \
mediainfo-gui(aarch-64) \
metainfo() \
metainfo(mediainfo-gui.metainfo.xml) \
mimehandler(application/ogg) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flac) \
mimehandler(application/x-matroska) \
mimehandler(application/x-ogg) \
mimehandler(application/x-shockwave-flash) \
mimehandler(application/x-shorten) \
mimehandler(audio/amr) \
mimehandler(audio/amr-wb) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/webm) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-asf) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wax) \
mimehandler(audio/x-opus+ogg) \
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-real-audio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-anim) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-fli) \
mimehandler(video/x-flv) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmediainfo.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_html-suse.so.9.0.0()(64bit) \
libwx_gtk2u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libzen.so.0()(64bit)"

inherit rpm
