SUMMARY = "Draw trees with more than one root node, using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw trees with more than one root \
node. It is similar to pst-tree, though it uses a different \
placement algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-2023.201.1.01svn23451-53.2.noarch.rpm"
RPM_HASH = "98d12546fb8e82f9e64db079926147647c8c304b4a488d6c8ef022ed54fd661e41d8d3e82108e30c7b32ba2ad0eff9d38a022ffe4aac4fbd1028f69e5c467767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tvz.sty \
tex-pst-tvz.tex \
texlive-pst-tvz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
