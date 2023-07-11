SUMMARY = "International Phonetic Alphabet fonts"
DESCRIPTION = "The package provides a 7-bit IPA font, as Metafont source, and \
macros for support under TeXt1 and LaTeX. The fonts (and \
macros) are now largely superseded by the tipa fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25469"

RPM_NAME = "texlive-wsuipa-2023.201.svn25469-52.2.noarch.rpm"
RPM_HASH = "b5f5aafcfd82b83d453d2822691357bec6275c8dabbb0e84a0732a867268f223c98e63b34b0dc514c48bf9357cdef517d28cd13655a576f435ad9749ee06883e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ipa.sty \
tex-ipalmacs.sty \
tex-uipa.fd \
tex-wbxipa10.tfm \
tex-wbxipa11.tfm \
tex-wbxipa12.tfm \
tex-wbxipa17.tfm \
tex-wbxipa8.tfm \
tex-wbxipa9.tfm \
tex-wslipa10.tfm \
tex-wslipa11.tfm \
tex-wslipa12.tfm \
tex-wslipa17.tfm \
tex-wslipa8.tfm \
tex-wslipa9.tfm \
tex-wsuipa10.tfm \
tex-wsuipa11.tfm \
tex-wsuipa12.tfm \
tex-wsuipa17.tfm \
tex-wsuipa8.tfm \
tex-wsuipa9.tfm \
texlive-wsuipa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
