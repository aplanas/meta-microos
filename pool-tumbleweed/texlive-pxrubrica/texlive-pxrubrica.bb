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

RPM_NAME = "texlive-pxrubrica-2023.209.1.3esvn66298-54.2.noarch.rpm"
RPM_HASH = "4068ef2fa49cc7940d9cf2b24a5783f358e4532989d91c9f7fae6561c7b3752a215c8f4f789b981f6aee7e31964e23d31049ee4a8b25606fe2ff2087b1f345bb"
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
