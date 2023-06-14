SUMMARY = "Calligraphic font"
DESCRIPTION = "A calligraphic font in the handwriting style of the author, \
Peter Vanroose. The font is supplied as Metafont source. LaTeX \
support of the font is provided in the calligra package in the \
fundus bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-calligra-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "1e1f833f93a3acd5da801d61f5718a4deffe73dd670fd0e28bcd8d67cbedaf6cbd7795826fe9f88186a1c1f336ce453a9eec6c1d4bb7b12a2a4bfa7f139de900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-callig15.tfm \
texlive-calligra"

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
