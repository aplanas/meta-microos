SUMMARY = "Make empty pages really empty"
DESCRIPTION = "This package prevents page numbers and headings from appearing \
on empty pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn18064"

RPM_NAME = "texlive-emptypage-2023.201.1.2svn18064-53.2.noarch.rpm"
RPM_HASH = "72822cf6ff442080b6b28f1a2b1d340ab7c4b5b6b38125783f27a2abbdeceae889bda32f51b491e7043a02780c098a2eeef98e69630bd63005938128c677e460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emptypage.sty \
texlive-emptypage"

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
