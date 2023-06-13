SUMMARY = "Vim support for poke"
DESCRIPTION = "Provides Vim support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "vim-poke-3.2-1.1.noarch.rpm"
RPM_HASH = "7188dc55e2165b8a400b75cbfc98a8b4ed5feed73402f3a2964d4a2bde2571098c268f58c2b08181a154aef50d992dbd0543c0b953d99928869bab5f1c875d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-poke"

RDEPENDS:${PN} += "poke \
vim"

inherit rpm
