SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac package. Ledmac itself was a \
LaTeX port of the plain TeX EDMAC macros. The package supports \
indexing by page and by line numbers, and simple tabular- and \
array-style environments. The package is distributed with the \
related eledpar package. The package is now superseded by \
reledmac."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-2023.209.1.24.12svn45418-54.2.noarch.rpm"
RPM_HASH = "72c0062262dadbe4bc78510e26c60ea882161eb33a8920a94b1bf8290f7f81afcf5997334a7a44fde2095ad70964e27a5142b4bce7486e9b00d2b7e2cc0b16d8"
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
