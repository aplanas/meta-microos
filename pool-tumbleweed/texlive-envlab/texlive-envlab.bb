SUMMARY = "Addresses on envelopes or mailing labels"
DESCRIPTION = "A LaTeX package for producing mailing envelopes and labels, \
including barcodes and address formatting according to the US \
Postal Service rules. Redefines the standard \\makelabels \
command of the LaTeX letter documentclass."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61937"

RPM_NAME = "texlive-envlab-2023.209.1.2svn61937-54.2.noarch.rpm"
RPM_HASH = "e07535c93290077546dc9c6c51b462171ef80293651f3d965ff08ee61d0c64a32e36b8a06345dc3eb30f4c1e964105e1bdb2f7f2e6c80d024c48aad8cf49bb7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-envlab.cfg \
tex-envlab.sty \
texlive-envlab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
