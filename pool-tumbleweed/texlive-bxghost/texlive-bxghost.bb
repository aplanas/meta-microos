SUMMARY = "Ghost insertion for proper xkanjiskip"
DESCRIPTION = "The package provides two commands to help authors for documents \
in Japanese to insert proper xkanjiskips. It supports LuaTeX, \
XeTeX, pTeX, upTeX, and ApTeX (pTeX-ng)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.1svn66147"

RPM_NAME = "texlive-bxghost-2023.209.0.0.5.1svn66147-53.1.noarch.rpm"
RPM_HASH = "315c65d961aca4a03b73345e6c745c4052e541433a5ed0a0c0cddf0e4765e6ef42b134fbd3a1859b15fddfa19e0e8b60801b7899ce80cbb271229fe753aeb0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxghost-lib.sty \
tex-bxghost.sty \
texlive-bxghost"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexja-adjust.sty \
tex-luatexja.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
