SUMMARY = "Minipages with marginal notes"
DESCRIPTION = "This package allows \\marginpar-commands inside of minipages and \
other boxes. (It takes another approach than marginnote by \
Markus Kohm: it saves all \\marginpar-commands and typesets them \
outside (i.e., after) the box.) The package defines an \
environment minipagewithmarginpars (to be used like \
minipage)--and the internal commands may be used by other \
packages to define similar environments or commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-minipage-marginpar-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "4d1ab45265b01b5ad71284562b01be47c249f4520b272b2706e7e5941773eff879f500bd168371165a4a9fe7ef8061438d91983ce523f290c1d8fc58083c1a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minipage-marginpar.sty \
tex-mpgmpar.sty \
texlive-minipage-marginpar"

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
