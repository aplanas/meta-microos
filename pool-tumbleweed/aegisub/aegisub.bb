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

RPROVIDES:${PN} += "aegisub"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libasound.so.2 \
libass.so.9 \
libboost-chrono.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libffms2.so.5 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-gl-suse.so.9.0.0 \
libwx-gtk3u-stc-suse.so.9.0.0 \
libz.so.1"

inherit rpm
