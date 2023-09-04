SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac and eledmac packages. Ledmac \
itself was a LaTeX port of the plain TeX EDMAC macros. The \
package supports indexing by page and by line numbers, and \
simple tabular- and array-style environments. The package is \
distributed with the related reledpar package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-2023.209.2.39.1svn63105-54.2.noarch.rpm"
RPM_HASH = "3b400eb393b29a362a7c0e7cfc38bab6d99c9f1fb52b31177a90c08024d237a446726e7afb7338d64d11688c55e5ba13d6d449fe7f6723faec93e12cd589d1fd"
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
