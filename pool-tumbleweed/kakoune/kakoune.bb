SUMMARY = "A code editor heavily inspired by Vim"
DESCRIPTION = "Kakoune is a code editor heavily inspired by Vim. \
It's faster as in less keystrokes, supports multiple selections and uses orthogonal design."
LICENSE = "Unlicense"

PV = "2022.10.31"

RPM_NAME = "kakoune-2022.10.31-2.2.aarch64.rpm"
RPM_HASH = "ce109738b7788dbc118ab190737821011e169331246c85a49091054f635cca20af95f2b68f14f5e48eaa3364826ac1aa9ef26f0d1bdbacb4de30d12cc8ea367b"

RPROVIDES:${PN} += "kakoune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
