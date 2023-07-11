SUMMARY = "An Interactive text-mode Process Viewer for Linux"
DESCRIPTION = "htop is an interactive text-mode process viewer for Linux. It aims to be a \
better 'top' and requires ncurses."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.2"

RPM_NAME = "htop-3.2.2-2.1.aarch64.rpm"
RPM_HASH = "010d7d03d7a0b8d9622933cbd1dad6187e16a1623756a01efcf381e7eae648dfbdcdf6ea8e0b035d16ca7f03cf14ef855927bebd34abc6d7b02fce8e51e9b5c5"

RPROVIDES:${PN} += "htop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtinfo.so.6"

inherit rpm
