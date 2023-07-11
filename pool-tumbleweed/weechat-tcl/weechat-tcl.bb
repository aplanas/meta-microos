SUMMARY = "Tcl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Tcl language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-tcl-3.8-1.3.aarch64.rpm"
RPM_HASH = "182df20ec574756f2e08981605dffccede7057c8e2c3f608313b057a22f5704f68348151900733ea0bbcd6fd48a76935acedc6818b4942a4c32a0e8f36472fd4"

RPROVIDES:${PN} += "weechat-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
weechat"

inherit rpm
