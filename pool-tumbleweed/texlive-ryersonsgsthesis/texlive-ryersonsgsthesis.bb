SUMMARY = "Ryerson School of Graduate Studies thesis template"
DESCRIPTION = "This package provides a LaTeX class and template files for \
Ryerson School of Graduate Studies (SGS) theses."
LICENSE = "Apache-1.0"

PV = "2023.209.1.0.3svn50119"

RPM_NAME = "texlive-ryersonsgsthesis-2023.209.1.0.3svn50119-54.1.noarch.rpm"
RPM_HASH = "6c34a91c7a079e197bd311f965b8170882359fbeeacf1a6edbff4d126293a6260061f0e81ab8b9cf44f09870109d049cffbf4d9e06ff8d9bc5151dab874296e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ryersonSGSThesis.cls \
texlive-ryersonsgsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-IEEEtrantools.sty \
tex-algorithm.sty \
tex-algorithmicx.sty \
tex-algpseudocode.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-appendix.sty \
tex-array.sty \
tex-blindtext.sty \
tex-caption.sty \
tex-charter.sty \
tex-cite.sty \
tex-csquotes.sty \
tex-float.sty \
tex-geometry.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-makeidx.sty \
tex-ragged2e.sty \
tex-report.cls \
tex-sectsty.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-subfiles.sty \
tex-titlesec.sty \
tex-todonotes.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
