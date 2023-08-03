SUMMARY = "French translation of classical BibTeX styles"
DESCRIPTION = "These files are French translations of the classical BibTeX \
style files. The translations can easily be modified by simply \
redefining FUNCTIONs named fr.*, at the beginning (lines \
50-150) of each file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-bib-fr-2023.209.1.5svn15878-54.1.noarch.rpm"
RPM_HASH = "690858d3d2070614d8ed9f4acfeb21f18c3f1a594cdda605b4a12f9da69bdd3a6799c83a9837127ec3d29b021713bb4d5d69200fd658efd431a987ad9e3fd7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bib-fr"

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
