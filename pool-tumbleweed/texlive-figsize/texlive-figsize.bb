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

PV = "2023.209.0.0.1svn18784"

RPM_NAME = "texlive-figsize-2023.209.0.0.1svn18784-53.1.noarch.rpm"
RPM_HASH = "5f01d8a90e9915f890fef3f5d01133eb4aab8f7b1b7e714e1293e8d044edaed590acffe5659506785e13eb54f1276252eec43752c4e771e05b99247f86893fd4"
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
