SUMMARY = "Ensure that multiple citations may break at line end"
DESCRIPTION = "Makes a very minor change to the operation of the \\cite \
command. Note that the change is not necessary in unmodified \
LaTeX; however, there remain packages that restore the \
undesirable behaviour of the command as provided in LaTeX 2.09. \
(Note that neither cite nor natbib make this mistake.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21014"

RPM_NAME = "texlive-breakcites-2023.209.svn21014-53.1.noarch.rpm"
RPM_HASH = "7d65d3b76b61295d3e4ea006d00ef7e2a5a53bdfdc1586a7673651f5277b0d3da73593dc6ea6c6c8690e0bc6ab4e39b73b3272072afe84f128970fea1a43c4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breakcites.sty \
texlive-breakcites"

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
