SUMMARY = "A code editor heavily inspired by Vim"
DESCRIPTION = "Kakoune is a code editor heavily inspired by Vim. \
It's faster as in less keystrokes, supports multiple selections and uses orthogonal design."
LICENSE = "Unlicense"

PV = "2022.10.31"

RPM_NAME = "kakoune-2022.10.31-2.1.aarch64.rpm"
RPM_HASH = "1b84c500c15decba53ec8ee13705b727d6668327ebfcb57a8a91ba48b6677fe73db928db392dfc6ae1da418940aadaad4cdfaf8092d67a1a1cdb4299368c39e0"

RPROVIDES:${PN} += "kakoune \
kakoune(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
