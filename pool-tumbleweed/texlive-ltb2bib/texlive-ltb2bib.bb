SUMMARY = "Converts amsrefs' .ltb bibliographical databases to BibTeX format"
DESCRIPTION = "This package implements a LaTeX command that converts an \
amsrefs bibliographical database (.ltb) to a BibTeX \
bibliographical database (.bib). ltb2bib is the reverse of the \
'amsxport' option in amsrefs. Typical uses are: produce bib \
entries for some publishers which don't accept amsrefs (Taylor \
& Francis, for example); import an ltb database in a database \
management program, e.g. for sorting; access one's ltb database \
within emacs's RefTeX mode."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.01svn43746"

RPM_NAME = "texlive-ltb2bib-2023.208.0.0.01svn43746-53.1.noarch.rpm"
RPM_HASH = "8026406e5d3a567b2c2460cf8ee4654d42c4f58c92b94826c34feb58ba1a12e7a77e1bb5d1388aac710aef950871982069de113e18323e014c1c39859769e3e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltb2bib.sty \
texlive-ltb2bib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsrefs.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
