SUMMARY = "BibTeX style for Nucleic Acid Research"
DESCRIPTION = "This BibTeX bibliography style is for the journal Nucleic Acid \
Research. It was adapted from the standard unsrt.bst style \
file."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.19svn38100"

RPM_NAME = "texlive-nar-2023.201.3.19svn38100-54.1.noarch.rpm"
RPM_HASH = "c8dec8638689b3f865b638cde6cbe08bc0ed8daa97862d9aa47e8444c6e35ae571514ac92da167cc6a24029a34c2395d45dda3235767f24ebe4b6759d82d66e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nar"

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
