SUMMARY = "An extended ltxguide class"
DESCRIPTION = "The ltxguidex document class extends ltxguide with a set of \
environments and commands that make writing beautiful LaTeX \
documentation easier and more natural."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2.0svn50992"

RPM_NAME = "texlive-ltxguidex-2023.208.0.0.2.0svn50992-53.1.noarch.rpm"
RPM_HASH = "504ea2681dba399b70ca0d80ff7d21119d661f94f2591c73a2ff2fd6ffcd89545369bfe5ef3b9f193dd4d01bfe38a713144355fe672f7217ed63e7d31ca1fd6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxguidex.cls \
texlive-ltxguidex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-framed.sty \
tex-hyperref.sty \
tex-ltxguide.cls \
tex-showexpl.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
