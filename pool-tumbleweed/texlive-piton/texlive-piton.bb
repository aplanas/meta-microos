SUMMARY = "Typeset Python listings with LPEG"
DESCRIPTION = "This package uses the Lua library LPEG to typeset and highlight \
Python listings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65835"

RPM_NAME = "texlive-piton-2023.201.1.4svn65835-51.1.noarch.rpm"
RPM_HASH = "b3a324a8b61487e00b33a8fa97c1f59e4418735aa9b186230897f82f406eefe945f4b84249d0ebbc1ae3cfa16aafa21da8a28bb5468cacbb4b4e4617e138af11"
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
