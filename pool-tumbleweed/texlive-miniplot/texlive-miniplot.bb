SUMMARY = "A package for easy figure arrangement"
DESCRIPTION = "MiniPlot is a package to help the LaTeX user typeset EPS \
figures using an easy-to-use interface. Figures can be arranged \
as one-figure-only or as a collection of figures in columns and \
rows which can itself contain sub-figures in columns and rows. \
Wrapped figures are also supported. This package provides \
commands to display a framebox instead of the figure as the \
graphics package does already but additionally it writes useful \
information such as the label and scaling factor into these \
boxes."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17483"

RPM_NAME = "texlive-miniplot-2023.201.svn17483-54.1.noarch.rpm"
RPM_HASH = "c71417d93a74bb7ecf988a0a3acd0361fcc1b5ce94a229c74b1151f9c787058bb45e3176209e32b1d7cdac1e6cb9396682619ee55f35597db96c6a400d72d49c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-miniplot.sty \
texlive-miniplot"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-epsfig.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
