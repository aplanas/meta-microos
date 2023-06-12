SUMMARY = "Package for setting nucleotide and peptide alignments"
DESCRIPTION = "TeXshade is alignment shading software completely written in \
TeX/LaTeX; it can process multiple sequence alignments in the \
.MSF and the .ALN file formats. In addition to common shading \
algorithms, it provides special shading modes showing \
functional aspects, e.g. charge or hydropathy, and a wide range \
of commands for handling shading colours, text styles, labels, \
legends; it even allows the user to define completely new \
shading modes. TeXshade combines highest flexibility with TeX \
output quality -- all in a bundle that does not demand \
excessive development time of the user."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.26asvn64242"

RPM_NAME = "texlive-texshade-2023.201.1.26asvn64242-54.1.noarch.rpm"
RPM_HASH = "7e52d8ee01239c61412a245b4ab2f3b6e27a27729737acfe1d151e2008883bb414f4c102ad83d4c0755876618517bba73dcdf193a084ad5ecc6163db014f7ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texshade.def) \
tex(texshade.sty) \
texlive-texshade"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(color.sty) \
tex(graphics.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
