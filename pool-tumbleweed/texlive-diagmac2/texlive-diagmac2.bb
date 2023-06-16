SUMMARY = "Diagram macros, using pict2e"
DESCRIPTION = "This is a development of the long-established diagmac package, \
using pict2e so that the restrictions on line direction are \
removed."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-diagmac2-2023.201.2.1svn15878-52.1.noarch.rpm"
RPM_HASH = "6f5d3aef03670fb656146f92ecbf57f3a881ac6bb153ee4f724bde133102488e71bec7c8b30191ed4ef1755ec59ca33e6874b994f6b2235400a850b39d578c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagmac2.sty \
texlive-diagmac2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
