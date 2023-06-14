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

PV = "2023.204.1.55svn45255"

RPM_NAME = "texlive-curves-2023.204.1.55svn45255-54.1.noarch.rpm"
RPM_HASH = "d6f1f7cf9e22e6ebfc17bc6bc214d88a9ed75d0c15601314cc205203f902d0885415642d79bcf1a41b4723f01f4bac79fbafc4c30886388dc4f186c0e13b855b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-curves.sty \
tex-curvesls.sty \
texlive-curves"

RDEPENDS:${PN} += "/bin/sh \
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
