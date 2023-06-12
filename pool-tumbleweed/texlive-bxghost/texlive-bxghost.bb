SUMMARY = "Ghost insertion for proper xkanjiskip"
DESCRIPTION = "The package provides two commands to help authors for documents \
in Japanese to insert proper xkanjiskips. It supports LuaTeX, \
XeTeX, pTeX, upTeX, and ApTeX (pTeX-ng)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.1svn66147"

RPM_NAME = "texlive-bxghost-2023.201.0.0.5.1svn66147-52.1.noarch.rpm"
RPM_HASH = "0ca3408672a99c75d2c420eb7a3aa51b7d92e3835df838edb5bb33beb64ee142181eb75858852d8c734b0a22a159201ce02cb982ab8d084156d55bcfaa66c731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxghost-lib.sty) \
tex(bxghost.sty) \
texlive-bxghost"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(luatexja-adjust.sty) \
tex(luatexja.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
