SUMMARY = "Encrypt documents with a three rotor Enigma"
DESCRIPTION = "The package provides historical encryption (Enigma cipher) for \
LuaTeX-based formats."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.1svn29802"

RPM_NAME = "texlive-enigma-2023.201.0.0.1svn29802-53.1.noarch.rpm"
RPM_HASH = "7a4056ab6b96ce672f6e47fc04c6db8335952fab8a283ebd7b4b4c6a571a2f3501ded4c21729ee2d44da33fa3b3eceb3037871e9e41d6d6090efb21ef1e77bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enigma.sty \
tex-enigma.tex \
texlive-enigma"

RDEPENDS:${PN} += "/bin/sh \
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
