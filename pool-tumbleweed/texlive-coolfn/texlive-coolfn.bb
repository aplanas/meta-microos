SUMMARY = "Typeset long legal footnotes"
DESCRIPTION = "This package provides formatting for footnotes in long legal \
documents, using hanging indents to make them look nicer."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn66221"

RPM_NAME = "texlive-coolfn-2023.209.1.1.0svn66221-55.1.noarch.rpm"
RPM_HASH = "1895d0f5f4a0303ef7ee13460a911b248631a98fec0d91e2afd2351a8ed782210451658fcc51f08ee12ddbb056f5d42f40f8f4a824d2be5bc99c98d4775d52d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolfn.sty \
texlive-coolfn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-footmisc.sty \
tex-hanging.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
