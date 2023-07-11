SUMMARY = "Japanese-style endnotes"
DESCRIPTION = "This package provides customized styles for endnotes to be used \
with Japanese documents. It can be used on pLaTeX, upLaTeX, and \
LuaLaTeX (LuaTeX-ja)."
LICENSE = "BSD-3-Clause"

PV = "2023.201.3.0svn47703"

RPM_NAME = "texlive-endnotesj-2023.201.3.0svn47703-53.2.noarch.rpm"
RPM_HASH = "cf4c7a6362cf648d640bfd70f86a08ac6b833ae6d3f2c3e73b1e0874093d4f2a65ae6e84de394f62db45e1a3a1a84881c57cd65033a03b42f4db6d7923b6e3f0"
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
