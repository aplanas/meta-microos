SUMMARY = "Encrypt documents with a three rotor Enigma"
DESCRIPTION = "The package provides historical encryption (Enigma cipher) for \
LuaTeX-based formats."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.1svn29802"

RPM_NAME = "texlive-enigma-2023.201.0.0.1svn29802-53.2.noarch.rpm"
RPM_HASH = "4419d8dd9c6452db554c9e352a0f6664e78435e2dd07a2bf73479d9f1ff74cc3c7ada48ee18f5191e164f3b99a74fb1840f0338715eb35f02d32044691f7b4f1"
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
