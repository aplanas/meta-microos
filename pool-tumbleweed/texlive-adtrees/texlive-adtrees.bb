SUMMARY = "Macros for drawing adpositional trees"
DESCRIPTION = "This package provides a means to write adpositional trees, a \
formalism devoted to representing natural language expressions. \
The package relies on epic and cancel."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn51618"

RPM_NAME = "texlive-adtrees-2023.201.1.1svn51618-54.1.noarch.rpm"
RPM_HASH = "67eaf246f3a86a41720c15c13f858ee0acbd7d103bc0e77c8fbaaed04c00d2e5647438926173fa81bf13ae9c6327de65224dec41995c1b56114c5ae8acf76878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(adtrees.sty) \
texlive-adtrees"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cancel.sty) \
tex(epic.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
