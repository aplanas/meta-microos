SUMMARY = "Ruby annotations according to JIS X 4051"
DESCRIPTION = "This package provides a function to add ruby annotations \
(furigana) that follow the style conventional in Japanese \
typography as described in the W3C technical note 'Requirements \
for Japanese Text Layout' ([JLREQ]) and the JIS specification \
JIS X 4051. Starting with version 1.3, this package also \
provides a function to add kenten (emphasis marks) to Japanese \
text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-2023.209.1.3esvn66298-54.1.noarch.rpm"
RPM_HASH = "7fb9588792fcfa8f4567ed145bf4338578a846fd8fe78415fb093622c061dbd497674bccc484a21d994398299e7f5a914a42467ac7e4d7c33104b59c1fce208e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxrubrica.sty \
texlive-pxrubrica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
