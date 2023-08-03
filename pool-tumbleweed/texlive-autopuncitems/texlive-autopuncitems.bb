SUMMARY = "Automatically punctuate lists"
DESCRIPTION = "This package provides the autopunc option in the enumitem \
environments itemize, enumerate, and description to \
automatically punctuate the items. It uses lua pattern matching \
to modify the environment's contents."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63045"

RPM_NAME = "texlive-autopuncitems-2023.209.svn63045-54.1.noarch.rpm"
RPM_HASH = "05f7d868ccc56e8ffff5fcafd6b004540fd6fe3d297a9e6199640abde011ac0b2aff72bff3440ba8e575345c570c6625df97c5b15f2d1080fad36f9a4827af06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopuncitems.sty \
texlive-autopuncitems"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
