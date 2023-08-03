SUMMARY = "Curves for LaTeX picture environment"
DESCRIPTION = "This package draws curves in the standard LaTeX picture \
environment using parabolas between data points with continuous \
slope at joins; for circles and arcs, it uses up to 16 \
parabolas. The package can also draw symbols or dash patterns \
along curves. The package provides facilities equivalent to \
technical pens with compasses and French curves. Curves consist \
of short secants drawn by overlapping disks or line-drawing \
\\special commands selected by package options."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.55svn45255"

RPM_NAME = "texlive-curves-2023.209.1.55svn45255-55.1.noarch.rpm"
RPM_HASH = "2e2b28307bade3ef30a023e241395c21382e58a5019c41f347c5fce9346d4af2265d7f8b7dd29ec75022e7b89acad72a360ed252d6b2e49d1348b19fa2db8e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curves.sty \
tex-curvesls.sty \
texlive-curves"

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
