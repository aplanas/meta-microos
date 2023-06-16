SUMMARY = "XeLaTeX template for writing the main body of NSFC proposals"
DESCRIPTION = "The package provides a XeLaTeX template for writing the main \
body of National Natural Science Foundation of China (NSFC) \
proposals, which are allowed to apply online. The package \
defines styles of the outlines and uses BibLaTeX/biber for the \
management of references."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn60280"

RPM_NAME = "texlive-mynsfc-2023.201.1.30svn60280-54.1.noarch.rpm"
RPM_HASH = "7b0630f0e2530c3ce18b5ced6c29bc0f98df8a66c02b9f95fbd31a8e0524eaf3c1e4a5721fa97fb5b3a2fb61e604b57e7208a3a721492503092bd562413db5f4"
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
