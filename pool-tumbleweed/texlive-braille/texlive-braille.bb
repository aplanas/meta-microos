SUMMARY = "Support for braille"
DESCRIPTION = "This package allows the user to produce Braille documents on \
paper for the blind without knowing Braille (which can take \
years to learn). Python scripts grade1.py and grade2.py convert \
ordinary text to grade 1 and 2 Braille tags; then, the LaTeX \
package takes the tags and prints out corresponding Braille \
symbols."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20655"

RPM_NAME = "texlive-braille-2023.209.svn20655-53.1.noarch.rpm"
RPM_HASH = "ff4ba980e64f43570cccbc6fe0260a8c70b91860c8acae7b7033c2b3c2bdc5a270e619b99a7d1108357ced773f111faffd37d1f3740e15f99e297273687431a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-braille.sty \
texlive-braille"

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
