SUMMARY = "Italian full text styles for the datetime2 package"
DESCRIPTION = "Italian date and time styles that use words for the numbers and \
ordinals. This package provides the following date and time \
styles: 'it-fulltext' and 'it-fulltext-twenty-four'. The first \
style uses a format 'am pm', the second a format '24 hours'. \
The necessary packages are datetime2, itnumpar, ifxetex, and \
ifluatex. This package is the translation and adaptation of \
datetime2-en-fulltext."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54779"

RPM_NAME = "texlive-datetime2-it-fulltext-2023.209.1.6svn54779-53.1.noarch.rpm"
RPM_HASH = "02c30a265fc999c5d2898c8f7e7a8b0727a832f124031b6aa392318ace1797c221a6be718fb8fa95e266d6ec05b74b90ce78152a80b278912b74e33bafcbf69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-it-fulltext-ascii.ldf \
tex-datetime2-it-fulltext-utf8.ldf \
tex-datetime2-it-fulltext.sty \
texlive-datetime2-it-fulltext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime2.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-itnumpar.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
