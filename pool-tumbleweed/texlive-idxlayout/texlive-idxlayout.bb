SUMMARY = "Configurable index layout, responsive to KOMA-Script and memoir"
DESCRIPTION = "The idxlayout package offers a key-value interface to configure \
index layout parameters, e.g. allowing for three-column indexes \
or for 'parent' items and their affiliated subitems being \
typeset as a single paragraph. The package is responsive to the \
index-related options and commands of the KOMA-Script and \
memoir classes."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-2023.208.0.0.4dsvn25821-53.1.noarch.rpm"
RPM_HASH = "71c119619a1a3440af97f29b7e61cd5db33809a0d62d8287276df9b279cf00cfd5eb06bcfbe91997ecd080bd5f9ef87d2671e2ee359da907314c77c0f4293b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-idxlayout.sty \
texlive-idxlayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-multicol.sty \
tex-ragged2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
