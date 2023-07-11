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

RPM_NAME = "texlive-eledmac-2023.201.1.24.12svn45418-53.2.noarch.rpm"
RPM_HASH = "dca60bad253e1a13a06589e462be07a4cf7c2de50703300130c3523cfeae6f22bb8690987d12dba8d7aa4cc07472d003e9cfbf8b9d41ae5638c88ce384db38ce"
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
