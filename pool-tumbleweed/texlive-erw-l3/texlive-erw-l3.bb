SUMMARY = "Utilities based on LaTeX3"
DESCRIPTION = "Utilities based on LaTeX3. Highlight: \\erw_merge_sort."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn61799"

RPM_NAME = "texlive-erw-l3-2023.201.4.2svn61799-53.2.noarch.rpm"
RPM_HASH = "d876c400e908c17ab24e60433e3fbf80909b7d0f43d5e82c595ae30047611f52369e1b12d96bd12d4bfaf2199fd6b546b6f43531e17b11a8e598c49204c26c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-erw-l3.sty \
texlive-erw-l3"

RDEPENDS:${PN} += "/usr/bin/sh \
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
