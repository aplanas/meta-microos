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

PV = "2023.201.0.0.01svn43746"

RPM_NAME = "texlive-ltb2bib-2023.201.0.0.01svn43746-52.1.noarch.rpm"
RPM_HASH = "20a4751930a8778264cbd59fdcd4288ac199f0405f6d886e3bf5c5156495e75dfdbc258996f6332ed6df2008ceaa4c4c7d7350b4be02fb75c19f5bbfbd77e8f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ltb2bib.sty) \
texlive-ltb2bib"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsrefs.sty) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
