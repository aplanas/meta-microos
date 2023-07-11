SUMMARY = "Ruby annotations according to JIS X 4051"
DESCRIPTION = "This package provides a function to add ruby annotations \
(furigana) that follow the style conventional in Japanese \
typography as described in the W3C technical note 'Requirements \
for Japanese Text Layout' ([JLREQ]) and the JIS specification \
JIS X 4051. Starting with version 1.3, this package also \
provides a function to add kenten (emphasis marks) to Japanese \
text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-2023.201.1.3esvn66298-53.2.noarch.rpm"
RPM_HASH = "997ae1ecd658a4d281345b8f248d9f5b9eaef3659dfd157f2770d92b87544e852555a4fdd249b76fdfb0f454ebf8e48686c2182250f7b4ce609af391ab71f46f"
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
