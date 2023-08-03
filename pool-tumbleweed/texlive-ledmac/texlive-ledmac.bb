SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A macro package for typesetting scholarly critical editions. \
The ledmac package is a LaTeX port of the plain TeX EDMAC \
macros. It supports indexing by page and line number and simple \
tabular- and array-style environments. The package is \
distributed with the related ledpar and ledarab packages. The \
package is now superseded by reledmac."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19.4svn41811"

RPM_NAME = "texlive-ledmac-2023.209.0.0.19.4svn41811-55.1.noarch.rpm"
RPM_HASH = "20670498e3b5a4623e0b2aeea7fb1aaf1e55a785eb1a6ce6853126d3126f3e000e5534c61466ef7807156ccccdea077a61dc5e13dd53e7a10aebe7d92129f07d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afoot.sty \
tex-ledarab.sty \
tex-ledmac.sty \
tex-ledpar.sty \
texlive-ledmac"

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
