SUMMARY = "Typeset tram boxes in LaTeX"
DESCRIPTION = "Tram boxes are highlighted with patterns of dots; the package \
defines an environment tram that typesets its content into a \
tram box. The pattern used may be selected in an optional \
argument to the environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn29803"

RPM_NAME = "texlive-tram-2023.201.0.0.2svn29803-52.1.noarch.rpm"
RPM_HASH = "450f16378aa49d05b1bfa16115a1e00870311c83869e2776e3530f44c9d40814af01279634381bacc50628a066a333c2118d5cde1f6b61baf817d8ae3b56952f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tram.sty \
texlive-tram"

RDEPENDS:${PN} += "/bin/sh \
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
