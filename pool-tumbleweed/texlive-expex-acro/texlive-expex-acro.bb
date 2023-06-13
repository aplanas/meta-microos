SUMMARY = "Wrapper for the expex package"
DESCRIPTION = "This is a small wrapper for the expex package, adding ways to \
define, use, and summarize glossing abbreviations. It also \
provides commands to refer to examples, as well as some inline \
formatting commands commonly used in linguistics."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn63319"

RPM_NAME = "texlive-expex-acro-2023.201.0.0.0.2svn63319-52.1.noarch.rpm"
RPM_HASH = "2507b9dfedd9e1597636faea0cf6ba1fed4a1966505ea12ba77e92a43085d80bed28206a96d70daf1b96899d3542055840fa0da1b4ebf3bd35353f82d1608f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(expex-acro.sty) \
texlive-expex-acro"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(acro.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(expex.sty) \
tex(l3keys2e.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
