SUMMARY = "A code editor heavily inspired by Vim"
DESCRIPTION = "Kakoune is a code editor heavily inspired by Vim. \
It's faster as in less keystrokes, supports multiple selections and uses orthogonal design."
LICENSE = "Unlicense"

PV = "2023.08.05"

RPM_NAME = "kakoune-2023.08.05-1.2.aarch64.rpm"
RPM_HASH = "97a7bfc7f921d4349a19fff630db600cdff98901be856f65c66b396105942605fd9301a61d06c38feb157ed6c70e5a4c9aa8af5cbbe866ce4f1491a5f4f891fd"

RPROVIDES:${PN} += "kakoune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
