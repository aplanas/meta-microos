SUMMARY = "A code editor heavily inspired by Vim"
DESCRIPTION = "Kakoune is a code editor heavily inspired by Vim. \
It's faster as in less keystrokes, supports multiple selections and uses orthogonal design."
LICENSE = "Unlicense"

PV = "2023.07.29"

RPM_NAME = "kakoune-2023.07.29-1.1.aarch64.rpm"
RPM_HASH = "a50ed13981c275476ddf9ceaba6f226fb1120c53396f74fb8a1da1237ac5219f268a6ffed2823b2a95f8e6f509196e357d2dd2290b837f303f2c1f64e05b142e"

RPROVIDES:${PN} += "kakoune"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
