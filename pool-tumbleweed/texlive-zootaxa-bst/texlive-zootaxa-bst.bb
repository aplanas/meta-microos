SUMMARY = "A BibTeX style for the journal Zootaxa"
DESCRIPTION = "This package provides a .bst reference style file for the \
journal Zootaxa that publishes contributions in zoology and \
classification. This is a fork of apa.bst as provided by TeX \
Live since this style file resembled the most Zootaxa's own \
style. Further modifications were made to the code in order to \
generate in-text citations and bibliography sections \
appropriately."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-2023.201.1.0svn50619-52.2.noarch.rpm"
RPM_HASH = "4972c53d77fd1b0f4ffca35d8554280b28b293456f2eaecbb0a6a5b50b8ab07f86a9a286d73fe7e8fc21aa023732d9bd6c69887461c98d331946789627137977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst"

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
