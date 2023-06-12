SUMMARY = "Graphical interface using Xterm of Mined text editor"
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

RPM_NAME = "xmined-2022.27-1.2.aarch64.rpm"
RPM_HASH = "9105538ce62f86d4760db1e0fe00c8ed519fd6e1b51e421a2c4dec6eb93314f8720affaac8cdcb587b9ed0717939902bd3607e490ed92b646a98c7c71daf15e4"

RPROVIDES:${PN} += "application() \
application(mined.desktop) \
mimehandler(text/plain) \
xmined \
xmined(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
mined \
xterm-bin"

inherit rpm
