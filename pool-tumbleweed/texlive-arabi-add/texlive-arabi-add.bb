SUMMARY = "Using hyperref and bookmark packages with arabic and farsi languages"
DESCRIPTION = "This package takes advantage of some of the possibilities that \
hyperref and bookmark packages offer when you create a table of \
contents for Arabic texts created by the arabi package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn37709"

RPM_NAME = "texlive-arabi-add-2023.209.1.0svn37709-55.1.noarch.rpm"
RPM_HASH = "0a0cccc8a116597f8fe8829abe035c08a20a04215cedbb81310fae8dbe3606a688982e8e26f9b1fa698c1e1697fb2a5315b2da70a853de1cba7dcc06fc4822a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabi-add.sty \
texlive-arabi-add"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-atveryend.sty \
tex-bookmark.sty \
tex-datatool.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
