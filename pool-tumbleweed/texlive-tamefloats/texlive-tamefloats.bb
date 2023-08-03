SUMMARY = "Experimentally use \\holdinginserts with LaTeX floats"
DESCRIPTION = "LaTeX's figures, tables, and \\marginpars are dangerous for \
footnotes (and probably also \\enlargethispage). Here is a \
proposal (a 'patch' package) to help, by using \\holdinginserts \
in a simple way. It replaces the original problem with a new \
one -- it is an experiment to find out whether the new problem \
is less bad (or it is just a contribution to the discussion, \
maybe just a summary of previous work). The files provide \
further information."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.42svn27345"

RPM_NAME = "texlive-tamefloats-2023.209.0.0.42svn27345-55.1.noarch.rpm"
RPM_HASH = "1fd36c8704af711b5efa97bcc2eb85629e36cbc1ed3cb54b3d7ec7bec5a12025a2b25d5f449bec1bbc0e07c2329577663a2407f903ffd8045f53ca76e7bee67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tameflts.sty \
texlive-tamefloats"

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
