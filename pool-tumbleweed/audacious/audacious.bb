SUMMARY = "Audio player with graphical UI and library functionality"
DESCRIPTION = "Audacious is an audio player. It is based on Qt and supports a wide \
range of audio codecs. It still features an alternative skinned user \
interface (based on Winamp 2.x skins). Historically, it started as a \
fork of a fork of XMMS."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "audacious-4.3-1.3.aarch64.rpm"
RPM_HASH = "efd1972c6c087c23c81143b24767d88601baf33540f3113e04925964e2afef592326bd3ecf9e91cc6e90d67a7482914e62f1a2b01c972c1671f1b619da8f8834"

RPROVIDES:${PN} += "application() \
application(audacious.desktop) \
audacious \
audacious(aarch-64) \
metainfo() \
metainfo(audacious.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-cue) \
mimehandler(application/x-ogg) \
mimehandler(application/xspf+xml) \
mimehandler(audio/aac) \
mimehandler(audio/flac) \
mimehandler(audio/midi) \
mimehandler(audio/mp3) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/prs.sid) \
mimehandler(audio/wav) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-it) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-stm) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(x-content/audio-cdda)"
RDEPENDS:${PN} += "audacious-plugins(aarch-64) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudcore.so.5()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit)"

inherit rpm
