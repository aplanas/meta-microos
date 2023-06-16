SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac package. Ledmac itself was a \
LaTeX port of the plain TeX EDMAC macros. The package supports \
indexing by page and by line numbers, and simple tabular- and \
array-style environments. The package is distributed with the \
related eledpar package. The package is now superseded by \
reledmac."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-2023.201.1.24.12svn45418-53.1.noarch.rpm"
RPM_HASH = "8f229f53a85366c5cbc98ee290cf89225c5e30732a29b45c8ce7a02254970daf66bbde02b5c1779fbd63a919a596730cbc0414b7aa99299a9adffaa11c40da2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eledmac.sty \
tex-eledpar.sty \
texlive-eledmac"

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
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
