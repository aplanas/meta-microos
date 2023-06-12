SUMMARY = "Draw simple bar charts in LaTeX"
DESCRIPTION = "The package provides horizontal bar charts, drawn using TikZ on \
a numeric X-axis. The focus of the package is simplicity and \
aesthetics."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn43928"

RPM_NAME = "texlive-bchart-2023.201.0.0.1.3svn43928-53.1.noarch.rpm"
RPM_HASH = "37bf5895805a626bdada141b0ed0c090aea864388fb9d96761317220cbca101bc63c764f6927dcada0574b3e0635ab63ddb0f35fa44ed509e106484b7f65e0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bchart.sty) \
texlive-bchart"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
