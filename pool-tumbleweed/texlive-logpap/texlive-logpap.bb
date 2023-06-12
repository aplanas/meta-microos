SUMMARY = "Generate logarithmic graph paper with LaTeX"
DESCRIPTION = "The logpap package provides four macros for drawing \
logarithmic-logarithmic, logarithmic-linear, linear-logarithmic \
and (because it was easy to implement) linear-linear graph \
paper with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-logpap-2023.201.0.0.6svn15878-54.1.noarch.rpm"
RPM_HASH = "4b5cb458bc8a3f295e90576e1f9da82b901685aefa94613d258f1168daa0ff810cdb61f83198835cf1c65b797ec113e9c91668e44e4b6d7f8cfe06d15431d7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(logpap.sty) \
texlive-logpap"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(color.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
