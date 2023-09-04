SUMMARY = "A BibTeX style for the journal Zootaxa"
DESCRIPTION = "This package provides a .bst reference style file for the \
journal Zootaxa that publishes contributions in zoology and \
classification. This is a fork of apa.bst as provided by TeX \
Live since this style file resembled the most Zootaxa's own \
style. Further modifications were made to the code in order to \
generate in-text citations and bibliography sections \
appropriately."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-2023.209.1.0svn50619-53.2.noarch.rpm"
RPM_HASH = "fdfc9eaa1408412a4b51b244a5f99eca0c2755ef3611e2a2e013f10e126595980a42311c55c81739dc399e99652858c8c5d2b2cafe92d39b20fbadeffb84509f"
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
