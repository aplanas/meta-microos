SUMMARY = "A filemanager similar to XTree"
DESCRIPTION = "ytree is a (curses-based) file manager similar to DOS XTree."
LICENSE = "GPL-2.0-only"

PV = "2.04"

RPM_NAME = "ytree-2.04-1.8.aarch64.rpm"
RPM_HASH = "31e20140f51c786f635db185d82eafa961b83b5d70a372e54a31a73824d45f65bbf5cef9533bb0a00b7169f300f2148393d4a99d65e9aa708520078488348eb3"

RPROVIDES:${PN} += "ytree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
