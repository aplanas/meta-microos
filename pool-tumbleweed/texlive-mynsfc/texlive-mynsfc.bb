SUMMARY = "XeLaTeX template for writing the main body of NSFC proposals"
DESCRIPTION = "The package provides a XeLaTeX template for writing the main \
body of National Natural Science Foundation of China (NSFC) \
proposals, which are allowed to apply online. The package \
defines styles of the outlines and uses BibLaTeX/biber for the \
management of references."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn60280"

RPM_NAME = "texlive-mynsfc-2023.209.1.30svn60280-55.1.noarch.rpm"
RPM_HASH = "ba5b2e293cb414b58ce2b6c2fc93953ffbb6a3aacabb022f4010d327c3733342e27add404e6436b2abaa1b2b338370469a541f08658c7cf4e8eb9af53943b84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mynsfc.cls \
texlive-mynsfc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-caption.sty \
tex-ctexart.cls \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-marvosym.sty \
tex-paralist.sty \
tex-subcaption.sty \
tex-subfig.sty \
tex-titlesec.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
