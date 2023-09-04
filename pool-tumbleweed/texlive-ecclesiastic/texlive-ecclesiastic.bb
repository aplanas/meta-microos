SUMMARY = "Typesetting Ecclesiastic Latin"
DESCRIPTION = "The package modifies the way the latin option to babel operates \
when typesetting Latin. The style is somewhat 'frenchified' in \
respect of punctuation spacings and footnote style; shortcuts \
are available in order to set accents on all vowels, including \
y and the diphthongs ae and oe."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-2023.209.0.0.3svn38172-54.2.noarch.rpm"
RPM_HASH = "1ae3e427efb8c7a91d684ca639286f791871b0aeafd5f2986b6834009789f3330866b1424a4062bcd5cd214104d9ca29c53fef0f08b5fd27b70b1ecb980e3e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecclesiastic.sty \
texlive-ecclesiastic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
