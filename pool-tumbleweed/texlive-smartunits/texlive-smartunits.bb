SUMMARY = "Converting between common metric and Imperial units"
DESCRIPTION = "This LaTeX package implements a \\SmartUnit macro for converting \
between (some) metric and Imperial units. The package requires \
pgfkeys and siunitx."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn39592"

RPM_NAME = "texlive-smartunits-2023.209.1.2svn39592-58.1.noarch.rpm"
RPM_HASH = "0d92faeeff8642fab88e632a7dcab81d99e6c05bf82fe5dad46f3d66aecdd8aada3cdc6249b9f026b960336228cea7f87cb3a7baf07c5f18fc8ebc68e4252c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smartunits.sty \
texlive-smartunits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfmath.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
