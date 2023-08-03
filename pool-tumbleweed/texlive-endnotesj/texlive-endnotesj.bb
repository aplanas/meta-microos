SUMMARY = "Japanese-style endnotes"
DESCRIPTION = "This package provides customized styles for endnotes to be used \
with Japanese documents. It can be used on pLaTeX, upLaTeX, and \
LuaLaTeX (LuaTeX-ja)."
LICENSE = "BSD-3-Clause"

PV = "2023.209.3.0svn47703"

RPM_NAME = "texlive-endnotesj-2023.209.3.0svn47703-54.1.noarch.rpm"
RPM_HASH = "afa25ea4f66fe7a1d86a4149f0c5e75ef15e86207d805eafd691eb7b5021e038d2873d9cd5ffb0325a9ddc8af296d4d552c4730440121e053dad4b8dc5904f3d"
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
