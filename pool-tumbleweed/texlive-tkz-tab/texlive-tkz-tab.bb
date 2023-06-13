SUMMARY = "Tables of signs and variations using PGF/TikZ"
DESCRIPTION = "The package provides comprehensive facilities for preparing \
lists of signs and variations, using PGF. The package \
documentation requires the tkz-doc bundle. This package has \
been taken temporarily out of circulation to give the author \
time to investigate some problems."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12csvn66115"

RPM_NAME = "texlive-tkz-tab-2023.201.2.12csvn66115-52.1.noarch.rpm"
RPM_HASH = "c3708e9c406bf26580e6452d9b32f1bcca8594b118f80564f282540e20c6e696533e1613e0c13cbc1b7cebacf77326ff85aafe6b1b1d0ec46cecd009c0600a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tkz-tab.sty) \
texlive-tkz-tab"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
