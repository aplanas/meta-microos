SUMMARY = "Improved underlines in mathematics"
DESCRIPTION = "The package provides a (maths mode) \\underline variant which \
doesn't impose italics correction at the end."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-noitcrul-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "28133bcbb54a2a788266a330f23efe4f48cccb21146e706563898b3034c895a6a0c67992fedfbec1d3a72b1f820ab675a1ffd87902b55b96bdd124e2b0fe6809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-noitcrul.sty \
texlive-noitcrul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-robustcommand.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
