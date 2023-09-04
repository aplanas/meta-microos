SUMMARY = "A filemanager similar to XTree"
DESCRIPTION = "ytree is a (curses-based) file manager similar to DOS XTree."
LICENSE = "GPL-2.0-only"

PV = "2.05"

RPM_NAME = "ytree-2.05-1.1.aarch64.rpm"
RPM_HASH = "5182cd6a70ca85c025343b45be60630b5366bc167afae93e2f97b922b0a2cbecb5c4fbc8966c017074bab257f7a2e20fa94f105768fb07fec2f8458beeaea866"

RPROVIDES:${PN} += "ytree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
