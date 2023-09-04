SUMMARY = "An extension to the glossaries package"
DESCRIPTION = "This package provides improvements and extra features to the \
glossaries package. Some of the default glossaries.sty \
behaviour is changed by glossaries-extra.sty. See the user \
manual glossaries-extra-manual.pdf for further details. \
glossaries-extra.sty requires the glossaries package and, \
naturally, all packages required by glossaries.sty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.50svn64973"

RPM_NAME = "texlive-glossaries-extra-2023.209.1.50svn64973-54.2.noarch.rpm"
RPM_HASH = "a18a012555709c3f6ea3914b8cfc51b2a37fa0e6ca68f377c36540268d68ec4209457e2e4f5dd1aa0ff2f252aa30095b50f8ab69017c21fb85b7d7752465df7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-example-glossaries-xr.tex \
tex-glossaries-extra-2021-11-22.sty \
tex-glossaries-extra-abbrstyles.def \
tex-glossaries-extra-bib2gls-2021-11-22.sty \
tex-glossaries-extra-bib2gls.sty \
tex-glossaries-extra-stylemods-2021-11-22.sty \
tex-glossaries-extra-stylemods.sty \
tex-glossaries-extra.sty \
tex-glossary-bookindex-2021-11-22.sty \
tex-glossary-bookindex.sty \
tex-glossary-longextra-2021-11-22.sty \
tex-glossary-longextra.sty \
tex-glossary-table.sty \
tex-glossary-topic-2021-11-22.sty \
tex-glossary-topic.sty \
texlive-glossaries-extra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-glossaries-accsupp.sty \
tex-glossaries-prefix.sty \
tex-glossaries.sty \
tex-glossary-inline.sty \
tex-glossary-list.sty \
tex-glossary-long.sty \
tex-glossary-longbooktabs.sty \
tex-glossary-longragged.sty \
tex-glossary-mcols.sty \
tex-glossary-super.sty \
tex-glossary-superragged.sty \
tex-glossary-tree.sty \
tex-longtable.sty \
tex-multicol.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
