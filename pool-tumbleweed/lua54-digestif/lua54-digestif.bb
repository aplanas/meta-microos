SUMMARY = "Language server for TeX and friends"
DESCRIPTION = "Digestif is a code analyzer, and a language server, for LaTeX, ConTeXt et caterva. \
It provides context-sensitive completion, documentation, code navigation, and related \
functionality to any text editor that speaks the LSP protocol."
LICENSE = "GPL-3.0-or-later & LPPL-1.3c"

PV = "0.5.1"

RPM_NAME = "lua54-digestif-0.5.1-1.2.noarch.rpm"
RPM_HASH = "7b232667cdeb332c0815a3687fceee803018768785ba94f796b56c45449c00a94b15448726eb700e9dc77260a389ce5f55544c7deef2553a43a38e70fc377f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-digestif \
lua54-digestif"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.4 \
lua54 \
update-alternatives"

inherit rpm
