SUMMARY = "Shapes for drawing flowcharts, using TikZ"
DESCRIPTION = "The package provides a set of 'traditional' flowchart element \
shapes; the documentation shows how to build a flowchart from \
these elements, using pgf/TikZ. The package also requires the \
makeshape package."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3svn36572"

RPM_NAME = "texlive-flowchart-2023.209.3.3svn36572-53.1.noarch.rpm"
RPM_HASH = "d04c60e7b9a2fdc1504c546ab2e875c7cbf4a76baf715b4f921aa9ba683c6c7f118bf86a66e83a2a4a76c98df8dfb48312aecce2eaab05c683032d8a4f7bd208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flowchart.sty \
texlive-flowchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-makeshape.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
