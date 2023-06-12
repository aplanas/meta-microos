SUMMARY = "Powerful Text Editor with Extensive Unicode and CJK Support"
DESCRIPTION = "Mined is a powerful text editor with a comprehensive yet concise and \
easy-to-use user interface supporting modern interaction paradigms, \
and fast, small-footprint behaviour. \
 \
Mined provides both extensive Unicode and CJK support offering many \
specific features and covering special cases that other editors \
are not aware of (like auto-detection features and automatic handling \
of terminal variations, or Han character information). \
It was the first editor that supported Unicode in a plain-text terminal \
(like xterm or rxvt)."
LICENSE = "GPL-3.0-or-later"

PV = "2022.27"

RPM_NAME = "mined-2022.27-1.2.aarch64.rpm"
RPM_HASH = "ebfa9f9c90978371624dbe0a65ace2d97426c223701206398de58ad987791cfe11884571f035ad012ab62d139a68e830671d3a82dc38dc834f7be0f29ff2d59d"

RPROVIDES:${PN} += "mined \
mined(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
