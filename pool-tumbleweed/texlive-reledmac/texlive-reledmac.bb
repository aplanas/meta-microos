SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac and eledmac packages. Ledmac \
itself was a LaTeX port of the plain TeX EDMAC macros. The \
package supports indexing by page and by line numbers, and \
simple tabular- and array-style environments. The package is \
distributed with the related reledpar package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-2023.201.2.39.1svn63105-53.2.noarch.rpm"
RPM_HASH = "30d6bea679fde6702bc93e0a881d77897269647e74d0ce108f935813b78d19fdc7d69113d0ba0fe054f6793b4117f71dcc7d55cdd60a4b878958c0862255a217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reledmac.sty \
tex-reledpar.sty \
texlive-reledmac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-ragged2e.sty \
tex-suffix.sty \
tex-xargs.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
