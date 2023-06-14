SUMMARY = "A filemanager similar to XTree"
DESCRIPTION = "ytree is a (curses-based) file manager similar to DOS XTree."
LICENSE = "GPL-2.0-only"

PV = "2.04"

RPM_NAME = "ytree-2.04-1.7.aarch64.rpm"
RPM_HASH = "c2696dee39ebdf36538e1890d9c030460897e1ba406101cb844803469396ccf860a4ccadbe9e81346d9c561ac59e551814356604ac41872fccc7b8eef297c7bf"

RPROVIDES:${PN} += "ytree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
