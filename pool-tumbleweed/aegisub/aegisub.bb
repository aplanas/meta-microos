SUMMARY = "Subtitle editor"
DESCRIPTION = "Aegisub is a subtitle editor. It works with the Advanced SubStation \
Alpha format (aptly abbreviated ASS) which allows for many advanced \
effects in the subtitles, apart from just basic timed text. \
 \
As upstream is orphaned, this version is the wangqr fork."
LICENSE = "BSD-3-Clause"

PV = "3.3.3"

RPM_NAME = "aegisub-3.3.3-2.6.aarch64.rpm"
RPM_HASH = "7c5058ab8b7b6556d6b46a150e502a0595b4d92457c650c7c0acf2919759a21beeee9c676141f85a17bc0cda8f5103a314ac5cc788b6717291c5ad653b93efe9"

RPROVIDES:${PN} += "aegisub \
aegisub(aarch-64) \
application() \
application(aegisub.desktop) \
metainfo() \
metainfo(aegisub.appdata.xml) \
mimehandler(application/x-srt) \
mimehandler(text/plain) \
mimehandler(text/x-ass) \
mimehandler(text/x-microdvd) \
mimehandler(text/x-ssa)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libasound.so.2()(64bit) \
libass.so.9()(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libffms2.so.5()(64bit) \
libfftw3.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0()(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
