SUMMARY = "FreeWnn Japanese Input System--Server Only"
DESCRIPTION = "FreeWnn is a Kana-Kanji translation system intended as a system \
powerful enough to translate entire sentences at once. \
 \
Wnn works in a client/server manner. The server portion of Wnn, or \
jserver, is used as a Kana-Kanji translation engine for clients like \
'xwnmo' and 'kinput2' (input systems for the X Window System) or for \
clients like 'Egg', which are part of Mule (MUlti-Lingual Emacs) and \
XEmacs. \
 \
This package contains only the Japanese server."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fwnn-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "a8cfda00d3d1e11ff1cce20c62ed47b4b20c2faffe5519ff9597665eb422e893dd77f6838ed4e205c8362e2aafa43d619c59f6419572ff872225df6d0f967d58"

RPROVIDES:${PN} += "config(fwnn) \
fwnn \
fwnn(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
fwnncom \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libwnn.so.0()(64bit) \
libwrap.so.0()(64bit) \
shadow"

inherit rpm
