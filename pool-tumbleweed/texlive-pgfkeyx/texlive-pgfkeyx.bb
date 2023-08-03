SUMMARY = "Extended and more robust version of pgfkeys"
DESCRIPTION = "The package extends and improves the robustness of the pgfkeys \
package. In particular, it can deal with active comma, equality \
sign, and slash in key parsing. The difficulty with active \
characters has long been a problem with the pgfkeys package. \
The package also introduces handlers beyond those that pgfkeys \
can offer."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn26093"

RPM_NAME = "texlive-pgfkeyx-2023.209.0.0.0.1svn26093-52.1.noarch.rpm"
RPM_HASH = "8e9539b8c4f993a3d3cd04d8cc77b5afad4df3c15334a42e05fd05a220d0348c3b5647040858071bc9eb997fe9138e4c54a0788b3cd755627097bb632af6f307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfkeyx.sty \
texlive-pgfkeyx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
