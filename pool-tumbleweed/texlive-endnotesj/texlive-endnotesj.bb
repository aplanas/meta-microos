SUMMARY = "Japanese-style endnotes"
DESCRIPTION = "This package provides customized styles for endnotes to be used \
with Japanese documents. It can be used on pLaTeX, upLaTeX, and \
LuaLaTeX (LuaTeX-ja)."
LICENSE = "BSD-3-Clause"

PV = "2023.201.3.0svn47703"

RPM_NAME = "texlive-endnotesj-2023.201.3.0svn47703-53.1.noarch.rpm"
RPM_HASH = "7121892dad7d6f90cc37ff17f0179c9878009c0c67484418a30d1542f5226505d10e656a7e80ec19f10f5cea938e96ebf507c4213cab8c3a0b6283c6abeca310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotesj.sty \
texlive-endnotesj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-endnotes.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
