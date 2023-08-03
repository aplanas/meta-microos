SUMMARY = "Luxury frontend to the \\index command"
DESCRIPTION = "Provides a convenient front-end for the \\index command. For \
example, with it you can generate multiple index entries in \
almost any form by a single command. The package is highly \
customizable, and works with all versions of LaTeX and probably \
most other TeX formats."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn32262"

RPM_NAME = "texlive-varindex-2023.209.2.3svn32262-54.1.noarch.rpm"
RPM_HASH = "564c99da8ba01ebd6d5bc7f1206c44eebf93edade7c381613258d851d95128e9e1ad84e8b282cf2aa3979d21dfa8da3bef76153ce5bb9e14d636279164c589bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-varindex.sty \
texlive-varindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-toolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
