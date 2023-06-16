SUMMARY = "Enable integration between MetaPost pictures and LaTeX"
DESCRIPTION = "The package allows integration between MetaPost pictures and \
LaTeX. The main feature is that passing parameters to the \
MetaPost pictures is possible and the picture code can be put \
inside arguments to commands, including \\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21691"

RPM_NAME = "texlive-gmp-2023.201.1.0svn21691-53.1.noarch.rpm"
RPM_HASH = "93d1f008e7863834066c36e66ab2a62ea7759d8caeddb8d8aa2e6f9d15673e3e1e5526a4d956281ae04c704ba43d8446dcdeb599c9a56e67a5ef07da5d770280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmp.sty \
texlive-gmp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
