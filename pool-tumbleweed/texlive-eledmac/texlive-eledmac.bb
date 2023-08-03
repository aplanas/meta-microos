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

RPM_NAME = "texlive-eledmac-2023.209.1.24.12svn45418-54.1.noarch.rpm"
RPM_HASH = "c11b3f55d91d581f0bf8c7a308752f02a21ad2969f852dbc56df7f362842aee55f0377754ef58c562059c387390e34138d9d8bc8b69f912a02555ce40f2836e0"
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
