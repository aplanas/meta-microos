SUMMARY = "Terminal based file browser"
DESCRIPTION = "nnn is a fork of noice, a terminal file browser with keyboard \
shortcuts for navigation, opening files and running tasks. There is \
no config file and MIME associations are hard-coded."
LICENSE = "BSD-2-Clause"

PV = "4.9"

RPM_NAME = "nnn-4.9-1.1.aarch64.rpm"
RPM_HASH = "e33fc666a2a3f645863283816417da5c806fe34437cce96b0ee4c9102b8b356acf9e8a3d2d028f1b4523c1333469dace18df3360bb11d9c9c2b9c4ca80a00cb8"

RPROVIDES:${PN} += "nnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
