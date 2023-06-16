SUMMARY = "Typeset long legal footnotes"
DESCRIPTION = "This package provides formatting for footnotes in long legal \
documents, using hanging indents to make them look nicer."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1.0svn66221"

RPM_NAME = "texlive-coolfn-2023.204.1.1.0svn66221-54.1.noarch.rpm"
RPM_HASH = "66f2514e860686456b9a6eb8a83561304acd30418396339cfd724e8eb923afcc41385c04d18630de20b9da0125dc0ee6d35b880db8f54e9aae1b0744a8e1de09"
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
