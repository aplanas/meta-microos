SUMMARY = "Addresses on envelopes or mailing labels"
DESCRIPTION = "A LaTeX package for producing mailing envelopes and labels, \
including barcodes and address formatting according to the US \
Postal Service rules. Redefines the standard \\makelabels \
command of the LaTeX letter documentclass."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-envlab-2023.201.1.2svn61937-53.2.noarch.rpm"
RPM_HASH = "caf4767d9347b49edf0bf8605ff44cca67e55bd94f93649d9798454a982d7801e93a260e5b9fb134ced41c97f253bd70a4e11b252eb7eb02825b867ce5e2677b"
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
