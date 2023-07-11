SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "libdialog15-1.3-10.1.aarch64.rpm"
RPM_HASH = "a0bded24dd9a035e4bdd5a97e0bbb3ea85aabc6ff04ca8a51773fc355e9dbc5f46c1f41ca9e4a6a7184539270961296e95d3128f9c521f61c56ec07e494531c8"

RPROVIDES:${PN} += "libdialog.so.15 \
libdialog15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
