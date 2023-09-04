SUMMARY = "Vim support for poke"
DESCRIPTION = "Provides Vim support for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "vim-poke-3.3-1.1.noarch.rpm"
RPM_HASH = "ee4879acc4f6586e5b5e5e2907937f90265f4befdb7c787b49fa28877a97f28c517cf27e2f0fd0d16671c905274c195f962b75cee5ef1e0d2ebe85444401cd9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-poke"

RDEPENDS:${PN} += "poke \
vim"

inherit rpm
