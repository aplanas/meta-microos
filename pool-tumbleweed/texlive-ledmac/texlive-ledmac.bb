SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A macro package for typesetting scholarly critical editions. \
The ledmac package is a LaTeX port of the plain TeX EDMAC \
macros. It supports indexing by page and line number and simple \
tabular- and array-style environments. The package is \
distributed with the related ledpar and ledarab packages. The \
package is now superseded by reledmac."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19.4svn41811"

RPM_NAME = "texlive-ledmac-2023.201.0.0.19.4svn41811-54.1.noarch.rpm"
RPM_HASH = "0376ee44fe5fbecd5cbcf24c8abe4bf2259742814494c69f9992fa94d03e94773ae80f3debeb8ec356028ad71fd5f716b1c3926b5e69cacd61c92ba511d2ef80"
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
