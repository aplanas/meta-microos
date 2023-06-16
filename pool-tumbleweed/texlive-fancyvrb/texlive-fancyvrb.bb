SUMMARY = "Sophisticated verbatim text"
DESCRIPTION = "Flexible handling of verbatim text including: verbatim commands \
in footnotes; a variety of verbatim environments with many \
parameters; ability to define new customized verbatim \
environments; save and restore verbatim text and environments; \
write and read files in verbatim mode; build 'example' \
environments (showing both result and verbatim source)."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.5asvn65585"

RPM_NAME = "texlive-fancyvrb-2023.201.4.5asvn65585-52.1.noarch.rpm"
RPM_HASH = "b8c8231bd037f3352f223d5bc3863ad0a4d9b605dc550f348832f76c6a8ec4a1aabbe3dcde0f0d2c784e0a6d721e34d6d2d6226eb769f543c91a70f04dadfb11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyvrb-ex.sty \
tex-fancyvrb.sty \
tex-hbaw.sty \
tex-hcolor.sty \
texlive-fancyvrb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pstricks.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
