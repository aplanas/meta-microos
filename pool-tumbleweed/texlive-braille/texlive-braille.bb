SUMMARY = "Support for braille"
DESCRIPTION = "This package allows the user to produce Braille documents on \
paper for the blind without knowing Braille (which can take \
years to learn). Python scripts grade1.py and grade2.py convert \
ordinary text to grade 1 and 2 Braille tags; then, the LaTeX \
package takes the tags and prints out corresponding Braille \
symbols."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20655"

RPM_NAME = "texlive-braille-2023.201.svn20655-52.1.noarch.rpm"
RPM_HASH = "a5192174399e524cfc45bbc0a693dfd5938bf7f94ee11772c0768eac95a140417aa6848fb5f0ddd07dc20da9e055b0dcd3e9356ef2f7fb71597e8487327110c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(braille.sty) \
texlive-braille"
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
