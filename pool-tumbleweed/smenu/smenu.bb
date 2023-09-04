SUMMARY = "A standard input word picker"
DESCRIPTION = "This tool reads words from a file or standard input, presents them in an \
interactive window after the current line on the terminal, and writes the \
selected words, if any, to standard output."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "smenu-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "78113de95a843bbd1fbd824ef5bf994567a98db598abc059f6c3c07ac0e5435e1c5c323cd11fa1a429a02652cc9e5fa1405e5635a3997a90ccb4faf7622cc036"

RPROVIDES:${PN} += "smenu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
