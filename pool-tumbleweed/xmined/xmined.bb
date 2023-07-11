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

RPM_NAME = "xmined-2022.27-1.3.aarch64.rpm"
RPM_HASH = "ba191b49fb6b7dd9392b53f160b1dd720224bf53acc4886a3d9975f405399d21e3a5d6efedb89ecb57e50f8610e43811982cd029e40f61561f681c81de72a348"

RPROVIDES:${PN} += "xmined"

RDEPENDS:${PN} += "/usr/bin/sh \
mined \
xterm-bin"

inherit rpm
