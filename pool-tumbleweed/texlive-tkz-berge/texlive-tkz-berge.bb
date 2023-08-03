SUMMARY = "Macros for drawing graphs of graph theory"
DESCRIPTION = "The package provides a collection of useful macros for drawing \
classic graphs of graph theory, or to make other graphs. This \
package has been taken temporarily out of circulation to give \
the author time to investigate some problems."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn57485"

RPM_NAME = "texlive-tkz-berge-2023.209.2.0svn57485-53.1.noarch.rpm"
RPM_HASH = "0bc38371e6adb71c68879c05411dc7266307c937f596e69d5af806f084e85af34dd0a90381c3bcfcda7e0587069e43a785aaac6be0a78dccb718026658219f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-berge.sty \
texlive-tkz-berge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tkz-graph.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
