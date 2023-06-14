SUMMARY = "Pandora Player"
DESCRIPTION = "pianobar is a console client for the personalized web radio pandora \
 \
- play and manage (create, add more music, delete, rename, ...) your stations \
- rate played songs and let pandora explain why they have been selected \
- show upcoming songs/song history \
- configure keybindings \
- last.fm scrobbling support (external application) \
- proxy support for listeners outside the USA"
LICENSE = "MIT"

PV = "2022.04.01"

RPM_NAME = "pianobar-2022.04.01-1.5.aarch64.rpm"
RPM_HASH = "182a4054bbcdfe799a3c7c3e9a332cb2c91a4508ca5d380771f9773a459a1b343bdff2a28c84820230d83a058cf8848205eb150b7010a4adb2fc0c80c5b1840e"

RPROVIDES:${PN} += "pianobar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libao.so.4 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libjson-c.so.5"

inherit rpm
