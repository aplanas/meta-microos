SUMMARY = "Draw simple bar charts in LaTeX"
DESCRIPTION = "The package provides horizontal bar charts, drawn using TikZ on \
a numeric X-axis. The focus of the package is simplicity and \
aesthetics."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn43928"

RPM_NAME = "texlive-bchart-2023.209.0.0.1.3svn43928-54.1.noarch.rpm"
RPM_HASH = "b9fbd84991c3538e55cb80b57ed78a0895b9d4d5c85d1fa0f0d15cbef3cb0a8ff446c10405a1f94a6bc5ae617bc47b8369ec8255271f45e71bb979946890dcb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bchart.sty \
texlive-bchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
