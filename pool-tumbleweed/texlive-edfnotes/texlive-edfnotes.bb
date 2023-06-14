SUMMARY = "Critical annotations to footnotes with ednotes"
DESCRIPTION = "The package modifies the annotation commands and label-test \
mechanism of the ednotes package so that critical notes appear \
on the pages and in the order that one would expect."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-2023.201.0.0.6bsvn21540-53.1.noarch.rpm"
RPM_HASH = "aa841d19e4fe29434576edf9fc8eee27287b9af67a8c776fe5b28921bec0a34b44a4e49d0afd80435f328629e3f8d6adf6ddae69ded53a0a4df70551b31e0e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edfnotes.sty \
texlive-edfnotes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fnlineno.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
