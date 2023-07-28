SUMMARY = "Vim color schemes selection"
DESCRIPTION = "Selection of vim color schemes based on Colors Sample Pack - \
http://www.vim.org/scripts/script.php?script_id=625."
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "vim-plugin-colorschemes-1.0-56.1.noarch.rpm"
RPM_HASH = "270131773cc140f9725b34af356ce34b35d16c186c35411b9baaba40605ae64ad6c2950e0838ff11b577a9c43cf149b6f665e701879510f79789afe3f5096565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-colorschemes"

RDEPENDS:${PN} += "vim"

inherit rpm
