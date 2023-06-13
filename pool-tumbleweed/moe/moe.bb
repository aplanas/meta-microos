SUMMARY = "A Text Editor"
DESCRIPTION = "GNU Moe is an 8-bit clean, console text editor for ISO-8859 and ASCII \
character encodings. It has a modeless interface, online help, \
multiple windows, unlimited undo/redo capability, unlimited line length, global \
search/replace (on all buffers at once), block operations, automatic \
indentation, word wrapping, file name completion, directory browser, duplicate \
removal from prompt histories, delimiter matching, text conversion from/to \
UTF-8 and romanization."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "moe-1.13-1.3.aarch64.rpm"
RPM_HASH = "7ef387261ebbd17cd56e7a238164bb606d49778be5fbd51c75fb2f66e1a096537da839025f67cc628645df1f87b6c24f7628e894691653e2e5ac30dd49e173df"

RPROVIDES:${PN} += "config(moe) \
moe \
moe(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libncurses.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
