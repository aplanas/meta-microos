SUMMARY = "Frontmatter with arabic page numbers"
DESCRIPTION = "This package modifies the definitions of \\frontmatter and \
\\mainmatter so that page numbering starts in arabic style from \
the front matter while preserving the rest of the original \
definitions. For it to work, \\pagenumbering has to be inside \
these macros--most of classes do that, but there are exceptions \
like memoir."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51474"

RPM_NAME = "texlive-arabicfront-2023.201.1.1svn51474-54.1.noarch.rpm"
RPM_HASH = "bcb8d9dff09dd40d34a95d313fc4a4589b6281d0e539afd3685cee73e8cdd5b0356965a2b61cb28ebba929dfb43f5b1f48b0a8fddfa520922c9305437cb84139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arabicfront.sty) \
texlive-arabicfront"
RDEPENDS:${PN} += "/bin/sh \
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
