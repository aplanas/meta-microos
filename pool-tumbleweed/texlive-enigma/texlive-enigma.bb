SUMMARY = "Encrypt documents with a three rotor Enigma"
DESCRIPTION = "The package provides historical encryption (Enigma cipher) for \
LuaTeX-based formats."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.1svn29802"

RPM_NAME = "texlive-enigma-2023.209.0.0.1svn29802-54.2.noarch.rpm"
RPM_HASH = "578a5ed37782e46f52aa1b620dc3e3ae5ced4c353aa9862d7ce21e6546bd5d0992ed213ea10d880cc50d8abe9b6914075154f7f66c9e7e29560f2b1bc93c7432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enigma.sty \
tex-enigma.tex \
texlive-enigma"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
