SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac and eledmac packages. Ledmac \
itself was a LaTeX port of the plain TeX EDMAC macros. The \
package supports indexing by page and by line numbers, and \
simple tabular- and array-style environments. The package is \
distributed with the related reledpar package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-2023.201.2.39.1svn63105-53.1.noarch.rpm"
RPM_HASH = "fdb0a3abc782c29fceab8164f079b02c546841028691a076e06b41f3caa0fbed485fbbaedb59b83cf5e0e575b83f08de573cfd090cb893bf1e937ed5e9e023ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reledmac.sty \
tex-reledpar.sty \
texlive-reledmac"

RDEPENDS:${PN} += "/bin/sh \
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
