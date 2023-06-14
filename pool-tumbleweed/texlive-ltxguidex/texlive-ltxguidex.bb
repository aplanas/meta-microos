SUMMARY = "An extended ltxguide class"
DESCRIPTION = "The ltxguidex document class extends ltxguide with a set of \
environments and commands that make writing beautiful LaTeX \
documentation easier and more natural."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn50992"

RPM_NAME = "texlive-ltxguidex-2023.201.0.0.2.0svn50992-52.1.noarch.rpm"
RPM_HASH = "0afeb871dd6be67d2a584014d97ac33a3d9a748ff96b39d7e7bc10bdda641710a24e15bb2768e4e69c6711e2523b1aec4941b6f7953c6202df00593b453ff37d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxguidex.cls \
texlive-ltxguidex"

RDEPENDS:${PN} += "/bin/sh \
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
