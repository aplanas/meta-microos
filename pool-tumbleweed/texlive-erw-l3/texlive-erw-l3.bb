SUMMARY = "Utilities based on LaTeX3"
DESCRIPTION = "Utilities based on LaTeX3. Highlight: \\erw_merge_sort."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn61799"

RPM_NAME = "texlive-erw-l3-2023.209.4.2svn61799-54.1.noarch.rpm"
RPM_HASH = "ebe7243b7b415b11bee4f25f348edd7ea2d49ca602fa47393f0981324a9c95c3a9e091abac8299ca2c96dffd68dc5194e47bbaeaf8baf1527ad11d1f1c5b6ab4"
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
