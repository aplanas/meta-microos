SUMMARY = "Plugin to produce aligned text, equations, declarations, etc"
DESCRIPTION = "Align lets you align statements on their equal signs, make comment boxes, align \
comments, align declarations, etc. It handles alignment on multiple separators, \
not just the first one, and the separators may be the same across the line or \
different."
LICENSE = "Vim"

PV = "37.43"

RPM_NAME = "vim-plugin-align-37.43-56.1.noarch.rpm"
RPM_HASH = "8e1a9e53829016565ce20054be81336b574ff1e4d236004f966831c46fd8c9ad510d77ae8f96bd3d34578af2f3592f318ca5a6dfd4852660c542aedde747347d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-align"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
