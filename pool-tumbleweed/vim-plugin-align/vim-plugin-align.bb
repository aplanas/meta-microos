SUMMARY = "Plugin to produce aligned text, equations, declarations, etc"
DESCRIPTION = "Align lets you align statements on their equal signs, make comment boxes, align \
comments, align declarations, etc. It handles alignment on multiple separators, \
not just the first one, and the separators may be the same across the line or \
different."
LICENSE = "Vim"

PV = "37.43"

RPM_NAME = "vim-plugin-align-37.43-55.1.noarch.rpm"
RPM_HASH = "2b8962806dd13f9af9e756bee58a12424c8701ccfedc67a1b28d14bf8ec7d12f3daa36350dce295f7ad1045582e2a6cba8ea4638b2c7e4c652762ac50fb6d84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-align"
RDEPENDS:${PN} += "/bin/sh \
vim"

inherit rpm
