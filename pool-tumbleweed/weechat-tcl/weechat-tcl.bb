SUMMARY = "Tcl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Tcl language."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-tcl-3.8-1.1.aarch64.rpm"
RPM_HASH = "2d3628d9ae9d0861bb9f11e2363f34e792db0c0acea9ba1e212425d7d531e2653b51e260a56119193ba9f122536d767736b660f811a45a88d1d1c83e0728b4d5"

RPROVIDES:${PN} += "weechat-tcl \
weechat-tcl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libtcl8.6.so()(64bit) \
weechat"

inherit rpm
