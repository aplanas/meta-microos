SUMMARY = "A class for typesetting UK legislation"
DESCRIPTION = "This package provides formatting to easily typeset draft UK \
legislation. The libre font Palatine Parliamentary is required \
to use this package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn65485"

RPM_NAME = "texlive-ukbill-2023.209.1.0.2svn65485-54.1.noarch.rpm"
RPM_HASH = "dcdbcd132d7e87ef325022f3dae6a4976dba374c06e019fc869214b900df5895696679e8c7b1b2230cbc00088cf11cd1be853fef5577d6462b44654008923709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ukbill.cls \
texlive-ukbill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-ccicons.sty \
tex-changepage.sty \
tex-enumitem.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyphenat.sty \
tex-lettrine.sty \
tex-memoir.cls \
tex-paralist.sty \
tex-setspace.sty \
tex-textpos.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
