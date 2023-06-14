SUMMARY = "Create EPS files from PSTricks figures"
DESCRIPTION = "Pst-eps is a PSTricks-based package for exporting PSTricks \
images 'on the fly' to encapsulated PostScript (EPS) image \
files, which can then be read into a document in the usual way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-pst-eps-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "8f200c3cfd06aa2b56a2e734e44f47f3c82eae602bd26da75c4d230b34459fad731989368c03ef748879b369bd29639b2e96f540b91224f0956de594c8fa0cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-eps.sty \
tex-pst-eps.tex \
texlive-pst-eps"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
