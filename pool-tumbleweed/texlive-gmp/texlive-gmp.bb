SUMMARY = "Enable integration between MetaPost pictures and LaTeX"
DESCRIPTION = "The package allows integration between MetaPost pictures and \
LaTeX. The main feature is that passing parameters to the \
MetaPost pictures is possible and the picture code can be put \
inside arguments to commands, including \\newcommand."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21691"

RPM_NAME = "texlive-gmp-2023.209.1.0svn21691-54.2.noarch.rpm"
RPM_HASH = "8e8944cedf56dd8f02d959b769b49ecd3fde5a700ff03e86c9e1e877b9cc426ddfcbe2fb019af3611b5f06a31eb9b0418529d03174da0afd6b48ef44cba2ed6c"
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
