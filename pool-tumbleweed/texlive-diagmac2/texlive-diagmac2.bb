SUMMARY = "Diagram macros, using pict2e"
DESCRIPTION = "This is a development of the long-established diagmac package, \
using pict2e so that the restrictions on line direction are \
removed."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-diagmac2-2023.209.2.1svn15878-53.1.noarch.rpm"
RPM_HASH = "f464d03953f76fc80cd311b738102bce6c9fb14c19efbab56fb2781020f834f8cffb544ca5ea8c3502c50de5e684de4c183657da949e9298a46b80b1da5f3aab"
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
