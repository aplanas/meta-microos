SUMMARY = "An extension to the glossaries package"
DESCRIPTION = "This package provides improvements and extra features to the \
glossaries package. Some of the default glossaries.sty \
behaviour is changed by glossaries-extra.sty. See the user \
manual glossaries-extra-manual.pdf for further details. \
glossaries-extra.sty requires the glossaries package and, \
naturally, all packages required by glossaries.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.50svn64973"

RPM_NAME = "texlive-glossaries-extra-2023.201.1.50svn64973-53.2.noarch.rpm"
RPM_HASH = "918a0144f2a2c0da2f15c1f3c242ffb622073985947078a401522d711a83e70bb3e9bd5565b85529f6173f93b5c6a9ae84247a1e6c6b71c27f37a63fe87836b3"
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
