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

RPM_NAME = "mined-2022.27-1.3.aarch64.rpm"
RPM_HASH = "336a7d4ac604bbb2461fe2fe049677df11d9829734e5f1cf86cd4b581eccfeb6ba08b1f679c52d4557c27ddb66fc963257e211920a479112a2762abe8a426ccd"

RPROVIDES:${PN} += "mined"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
