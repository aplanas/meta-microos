SUMMARY = "If-then-else command for processing potentially empty arguments"
DESCRIPTION = "This package provides a command for the LaTeX programmer for \
testing whether an argument is empty."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2bsvn47544"

RPM_NAME = "texlive-ifmtarg-2023.208.1.2bsvn47544-53.1.noarch.rpm"
RPM_HASH = "9038fbf10c3c5a9cc32b34b4f936be425a6f253e3720685f1aa390d74f6b98c9bb014504d28e70dfc52f6f10819dcc93d5f894520c2b4b3eac31f69a816c49fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifmtarg.sty \
texlive-ifmtarg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
