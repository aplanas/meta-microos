SUMMARY = "Serbian cyrillic localization"
DESCRIPTION = "This package provides abstract, chapter, title, date etc, for \
serbian language in cyrillic scripts in T2A encoding and cp1251 \
code pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23734"

RPM_NAME = "texlive-serbian-def-cyr-2023.201.svn23734-53.1.noarch.rpm"
RPM_HASH = "f3f1e80fc10e0ad0dc6b58a891f058787176040ed835693f8bc38d5e172966e6aff181fc0a5b4c3544a88a5d3068f1776fcfd21c981e6cff1617e658915e74ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(serbian-def-cyr.sty) \
texlive-serbian-def-cyr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(inputenc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
