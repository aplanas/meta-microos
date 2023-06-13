SUMMARY = "Support for using GFDL in LaTeX"
DESCRIPTION = "The GFDL (GNU Free Documentation License) is a popular license \
used for programming manuals, documentations and various other \
textual works too, but using this license with LaTeX is not \
very convenient. This package aims to help users in easily \
using the license without violating any rules of the license. \
With a handful of commands, users can rest assured that their \
document will be perfectly licensed under GFDL."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn65415"

RPM_NAME = "texlive-gfdl-2023.201.0.0.1svn65415-52.1.noarch.rpm"
RPM_HASH = "ff018836bf3174a276d67a3823b3d6d371fb7bd7f6b4957e97f5c9f77698f40a063925b4638959d382efa66e354f2976beba08780a0adc71e572f58086bd7209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gfdl-tex-1p1.tex) \
tex(gfdl-tex-1p2.tex) \
tex(gfdl-tex-1p3.tex) \
tex(gfdl.sty) \
texlive-gfdl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(csquotes.sty) \
tex(expkv-def.sty) \
tex(expkv-opt.sty) \
tex(float.sty) \
tex(hyperref.sty) \
tex(hyperxmp.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
