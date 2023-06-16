SUMMARY = "Extend the applicability of the \\footnote command"
DESCRIPTION = "The package treats footnotes in \\caption, the tabular \
environment, and \\chapter and other \\section-like commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29652"

RPM_NAME = "texlive-ftnxtra-2023.201.0.0.1svn29652-52.1.noarch.rpm"
RPM_HASH = "fbfacaf7b1cfe742d7afc78431a9024ac651f600d493274ebf7cf8231f838583368a5ec4168aaa0c838cce769a15cb6c565b385d6ba1402d4cde06e557c0de23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftnxtra.sty \
texlive-ftnxtra"

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
