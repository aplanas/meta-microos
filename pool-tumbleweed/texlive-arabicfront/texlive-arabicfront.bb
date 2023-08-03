SUMMARY = "Frontmatter with arabic page numbers"
DESCRIPTION = "This package modifies the definitions of \\frontmatter and \
\\mainmatter so that page numbering starts in arabic style from \
the front matter while preserving the rest of the original \
definitions. For it to work, \\pagenumbering has to be inside \
these macros--most of classes do that, but there are exceptions \
like memoir."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51474"

RPM_NAME = "texlive-arabicfront-2023.209.1.1svn51474-55.1.noarch.rpm"
RPM_HASH = "76e2823cf421f71764dfa495bcfc9443a40a311ae1a96c63c84acff7e33fc85d9a391c859516f3ade04537edcc3144c79cc29d9fbd93142ca2d39c47a355e464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabicfront.sty \
texlive-arabicfront"

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
