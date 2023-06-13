SUMMARY = "Menus and Input Boxes for Shell Scripts"
DESCRIPTION = "This program lets you use menus and dialog boxes in shell scripts."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-1.3-9.7.aarch64.rpm"
RPM_HASH = "94c75c04077272aa943b500b01aeb01119e633f862162263c61d16ef84e6c08b10b1632b8706891a0ac950c97a986cbc7942abfc6976ebf33ca3a41f88595f59"

RPROVIDES:${PN} += "config(dialog) \
dialog \
dialog(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdialog.so.15()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit) \
terminfo-base"

inherit rpm
