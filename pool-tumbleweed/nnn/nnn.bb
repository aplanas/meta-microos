SUMMARY = "Terminal based file browser"
DESCRIPTION = "nnn is a fork of noice, a terminal file browser with keyboard \
shortcuts for navigation, opening files and running tasks. There is \
no config file and MIME associations are hard-coded."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-4.8-1.1.aarch64.rpm"
RPM_HASH = "d89a61c737abca1e9854a1ee942cc1b91eaa658226d060c656d66fefcf7b85d582aec4b9e10932777fee8e98d0129d65ef9ed1164a67e6fa1a0940ffe2b283cf"

RPROVIDES:${PN} += "nnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
