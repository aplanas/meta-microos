SUMMARY = "Utilities based on LaTeX3"
DESCRIPTION = "Utilities based on LaTeX3. Highlight: \\erw_merge_sort."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn61799"

RPM_NAME = "texlive-erw-l3-2023.201.4.2svn61799-53.1.noarch.rpm"
RPM_HASH = "0489f37d61b73835f3e2e9b480b1f251956dc26363337c73c2108f5c1975a640bd97c1ab28e1765d87bd4da69a6a4bbb0381a353ac8c440fd9c093eeb26b56f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-erw-l3.sty \
texlive-erw-l3"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
