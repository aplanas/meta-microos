SUMMARY = "Configurable index layout, responsive to KOMA-Script and memoir"
DESCRIPTION = "The idxlayout package offers a key-value interface to configure \
index layout parameters, e.g. allowing for three-column indexes \
or for 'parent' items and their affiliated subitems being \
typeset as a single paragraph. The package is responsive to the \
index-related options and commands of the KOMA-Script and \
memoir classes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-2023.209.0.0.4dsvn25821-54.1.noarch.rpm"
RPM_HASH = "e038ab4e08256528296cf80feb0ec864edbeaa27bd81fb92e08d111aec805f3f73ca0f0b33f6ac9130c69204b080f147fac8c46867fe951ae3cdc93423da2af6"
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
