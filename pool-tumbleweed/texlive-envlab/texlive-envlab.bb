SUMMARY = "Addresses on envelopes or mailing labels"
DESCRIPTION = "A LaTeX package for producing mailing envelopes and labels, \
including barcodes and address formatting according to the US \
Postal Service rules. Redefines the standard \\makelabels \
command of the LaTeX letter documentclass."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61937"

RPM_NAME = "texlive-envlab-2023.209.1.2svn61937-54.1.noarch.rpm"
RPM_HASH = "d4e719460ee96400a586f2e29cb68b27436b9bc73afb99760869b4be8d1b96ff128d60e6a57e29619fc01622dc8d278ffa258254029918735ae1b085abdcc617"
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
