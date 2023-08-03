SUMMARY = "Danish variants of standard BibTeX styles"
DESCRIPTION = "Dk-bib is a translation of the four standard BibTeX style files \
(abbrv, alpha, plain and unsrt) and the apalike style file into \
Danish. The files have been extended with URL, ISBN, ISSN, \
annote and printing fields which can be enabled through a LaTeX \
style file. Dk-bib also comes with a couple of Danish sorting \
order files for BibTeX8."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-dk-bib-2023.209.0.0.6svn15878-53.1.noarch.rpm"
RPM_HASH = "21b981cb69083a289ce68a16bdea75711ba0445dffe89c40d40a55270a698853a0543e36a8380f6ca42afd277bc889b0080207f0f59b8d1839e6f17fc8c63812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dk-apali.sty \
tex-dk-bib.sty \
texlive-dk-bib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
