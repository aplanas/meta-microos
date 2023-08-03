SUMMARY = "'Lorem ipsum' for Plain TeX developers"
DESCRIPTION = "The package provides a paragraph generator designed for use in \
Plain TeX documents. The paragraphs generated contain many \
'f-groups' (ff, fl etc.) so the text can act as a test of the \
ligatures of the font in use."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.3svn30353"

RPM_NAME = "texlive-plipsum-2023.209.4.3svn30353-53.1.noarch.rpm"
RPM_HASH = "0cdd1baed5860ddb7b8d58418ab5276496daea5f87a6c1232d663ba1d38ccf1b2a2a8a977a7ac0d9e5220db02155bdfd423672ebc1225f648f235bb8a7e551a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plipsum.tex \
texlive-plipsum"

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
