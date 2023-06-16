SUMMARY = "A BibLaTeX style"
DESCRIPTION = "A BibLaTeX style, based on the Turabian Manual (a version of \
Chicago)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn19787"

RPM_NAME = "texlive-biblatex-historian-2023.201.0.0.4svn19787-53.1.noarch.rpm"
RPM_HASH = "480bb4e34631492555b6be6d1a935d719ffb748e0105d1f7e30c5265217d9ca3a19b58549947cad9dd062e352aa3daca88cc4ba9cdfa06540f1ebd6c11a67c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-historian.bbx \
tex-historian.cbx \
tex-historian.lbx \
texlive-biblatex-historian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
