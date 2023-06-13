SUMMARY = "Minipages with marginal notes"
DESCRIPTION = "This package allows \\marginpar-commands inside of minipages and \
other boxes. (It takes another approach than marginnote by \
Markus Kohm: it saves all \\marginpar-commands and typesets them \
outside (i.e., after) the box.) The package defines an \
environment minipagewithmarginpars (to be used like \
minipage)--and the internal commands may be used by other \
packages to define similar environments or commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-minipage-marginpar-2023.201.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "5b1cacdf9fadb55eeb047dc81e42f5601522aedf5410e71fc0dbd525bd611797576c2e7eeefda9163b0cf8ecd50dcf64ff18358d790435cf98de844d2591d12f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minipage-marginpar.sty) \
tex(mpgmpar.sty) \
texlive-minipage-marginpar"

RDEPENDS:${PN} += "/bin/sh \
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
