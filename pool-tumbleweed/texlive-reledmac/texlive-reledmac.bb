SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac and eledmac packages. Ledmac \
itself was a LaTeX port of the plain TeX EDMAC macros. The \
package supports indexing by page and by line numbers, and \
simple tabular- and array-style environments. The package is \
distributed with the related reledpar package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-2023.209.2.39.1svn63105-54.1.noarch.rpm"
RPM_HASH = "394bfcc8b83b7824d683c9e42ea83fa80d6f591833a026b7a433ad1bf9b997fba02a1ac9532d2869c07cb951df2c23ffd1e9993b5837b081d4f2311b6d8a5da4"
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
