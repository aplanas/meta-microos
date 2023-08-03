SUMMARY = "Typeset Python listings with LPEG"
DESCRIPTION = "This package uses the Lua library LPEG to typeset and highlight \
Python listings."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65835"

RPM_NAME = "texlive-piton-2023.209.1.4svn65835-52.1.noarch.rpm"
RPM_HASH = "ee708005feee5b7200fb62ea55e33e227e64db030744aaa87cdbaee538177d6d107b945dc17b7fe0a47aca448cdfea81fb85eb3d67de12c0114ec7e1b0906169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-piton.sty \
texlive-piton"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-footnote.sty \
tex-footnotehyper.sty \
tex-l3keys2e.sty \
tex-luacode.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
