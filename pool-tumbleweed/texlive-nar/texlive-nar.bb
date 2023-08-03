SUMMARY = "BibTeX style for Nucleic Acid Research"
DESCRIPTION = "This BibTeX bibliography style is for the journal Nucleic Acid \
Research. It was adapted from the standard unsrt.bst style \
file."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.19svn38100"

RPM_NAME = "texlive-nar-2023.209.3.19svn38100-55.1.noarch.rpm"
RPM_HASH = "34718af5d5f04e237ae3a387ee429c26e1725e0f5cd73a76c1ce2751f8c7f07d7bf882154daf19549b18329cc948b18f676ab2685092e7a676f1ae728f5d291d"
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
