SUMMARY = "Critical annotations to footnotes with ednotes"
DESCRIPTION = "The package modifies the annotation commands and label-test \
mechanism of the ednotes package so that critical notes appear \
on the pages and in the order that one would expect."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-2023.201.0.0.6bsvn21540-53.2.noarch.rpm"
RPM_HASH = "c6830fc74475d15a798f0258644cbc05ebc637f4f3a330613d0b3bfb4ad939ab1ddfcbad82f9d1f0b05b304078ecbab88870f9f1b28bfaf4131157100a888362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edfnotes.sty \
texlive-edfnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
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
