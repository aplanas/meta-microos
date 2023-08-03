SUMMARY = "Write labels for plants"
DESCRIPTION = "The package defines a command \\plant, which has three mandatory \
and seven optional argument. The package uses the labels"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29803"

RPM_NAME = "texlive-plantslabels-2023.209.1.0svn29803-52.1.noarch.rpm"
RPM_HASH = "845aa1ee6efd82f38c5e2b492d2afe8809fbb717b49dc80af3839391c293971e6eb090934e65f418a08ad7b8489c41664895119abd6ecc41446f4624f7184d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plantslabels.sty \
texlive-plantslabels"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-labels.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
