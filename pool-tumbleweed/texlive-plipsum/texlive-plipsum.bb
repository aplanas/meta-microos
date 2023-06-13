SUMMARY = "'Lorem ipsum' for Plain TeX developers"
DESCRIPTION = "The package provides a paragraph generator designed for use in \
Plain TeX documents. The paragraphs generated contain many \
'f-groups' (ff, fl etc.) so the text can act as a test of the \
ligatures of the font in use."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.3svn30353"

RPM_NAME = "texlive-plipsum-2023.201.4.3svn30353-52.1.noarch.rpm"
RPM_HASH = "b643d91789cade5520163e70f552bc2b120a847e5a48289aaef87185e04b15e3bee87304d428b8bb23f99c850ff710e303e2defa3a19c8319646ded32937f264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(plipsum.tex) \
texlive-plipsum"

RDEPENDS:${PN} += "/bin/sh \
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
