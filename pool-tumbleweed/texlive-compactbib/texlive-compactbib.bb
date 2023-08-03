SUMMARY = "Multiple thebibliography environments"
DESCRIPTION = "Allows a second bibliography, optionally with a different \
title, after the main bibliography."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-compactbib-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "18e3696cb456d9dc39b4ae81e8f4f164349e476ee812012d18ba2bd16ac8e056f55a5d9afe25d0159209978cae8f67f1bb3c56085d9f95097fc57a39de12ddf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-compactbib.sty \
texlive-compactbib"

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
