SUMMARY = "Macros for drawing adpositional trees"
DESCRIPTION = "This package provides a means to write adpositional trees, a \
formalism devoted to representing natural language expressions. \
The package relies on epic and cancel."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn51618"

RPM_NAME = "texlive-adtrees-2023.209.1.1svn51618-55.1.noarch.rpm"
RPM_HASH = "ec78fbcc5274f88064492af9cfc9ee0b705e1d57b03186f2475d3e7441a0c313768ae2e7d8a0f7042ff2a04c9e7fb3ff50df0e17fc4898d90d5fd208dabeb022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adtrees.sty \
texlive-adtrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cancel.sty \
tex-epic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
