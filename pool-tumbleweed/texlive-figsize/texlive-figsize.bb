SUMMARY = "Auto-size graphics"
DESCRIPTION = "The FigSize package enables automatic sizing of graphics, \
especially when including graphics with the graphicx package. \
The user only has to specify the number of graphics that should \
fit to a page or fraction there of and the package will \
dynamically calculate the correct graphics sizes relative to \
the page size. Thus, graphics can be auto-sized to fill a whole \
page or fraction and manual changes of graphic sizes are never \
needed when changing document layouts. Finally, the package's \
dynamic lengths can be used to allow other document element \
sizes to be dynamic."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn18784"

RPM_NAME = "texlive-figsize-2023.201.0.0.1svn18784-52.1.noarch.rpm"
RPM_HASH = "bb1f9590791c0f76b8f08015274bae2f6187eb052ad0fb693bc2385482557568822503adcfdc0366f71b22403c757a51c559c5e02728fdd592011f930a16d603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figsize.sty \
texlive-figsize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-subfigure.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
