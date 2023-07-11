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

RPM_NAME = "moe-1.13-1.4.aarch64.rpm"
RPM_HASH = "86e18b833a1968b6fd219b0d8c35a0701d56c8c7fd072597b84558f106e7701f93affd34bd8e8c5ccf9223ccd117c511faf67515164c59b02c6623ef02b69eb8"

RPROVIDES:${PN} += "config-moe \
moe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
