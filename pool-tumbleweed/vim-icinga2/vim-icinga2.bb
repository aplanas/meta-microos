SUMMARY = "Vim syntax highlighting for icinga2"
DESCRIPTION = "Provides Vim syntax highlighting for icinga2."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.8"

RPM_NAME = "vim-icinga2-2.13.8-1.1.aarch64.rpm"
RPM_HASH = "ff43103fea13520e3d3dd243003b2e7c5c66f88169dc728e4fdcb797ee1286a459449f076b571fa547819737e5d5262a647f306a1d055779be93af7936612ff6"

RPROVIDES:${PN} += "vim-icinga2"

RDEPENDS:${PN} += "vim"

inherit rpm
