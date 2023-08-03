SUMMARY = "Encrypt documents with a three rotor Enigma"
DESCRIPTION = "The package provides historical encryption (Enigma cipher) for \
LuaTeX-based formats."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.1svn29802"

RPM_NAME = "texlive-enigma-2023.209.0.0.1svn29802-54.1.noarch.rpm"
RPM_HASH = "79886a2560d8791ca3be34f475ff307cfe1a94b8dab23b02893de728d2edc3d0987c93b397074909d6cf524b0391dcb3c431ffd8fdcfada1c73a825f8700f872"
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
