SUMMARY = "Language server for TeX and friends"
DESCRIPTION = "Digestif is a code analyzer, and a language server, for LaTeX, ConTeXt et caterva. \
It provides context-sensitive completion, documentation, code navigation, and related \
functionality to any text editor that speaks the LSP protocol."
LICENSE = "GPL-3.0-or-later & LPPL-1.3c"

PV = "0.5.1"

RPM_NAME = "lua53-digestif-0.5.1-1.2.noarch.rpm"
RPM_HASH = "6afaddb359cfdd55d314332dde1feeab8f4e06a970131b3d0ce8cd8b6dac240c1709efaccf8d4670f7e740e965017b413fcfd3b69e44682ee91a6bc47c48af7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-digestif"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/lua5.3 \
lua53 \
update-alternatives"

inherit rpm
