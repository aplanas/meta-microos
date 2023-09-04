SUMMARY = "(No) Arabic hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Arabic."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54568"

RPM_NAME = "texlive-hyphen-arabic-2023.209.svn54568-54.1.noarch.rpm"
RPM_HASH = "8fba7819cf87c345f55f1df2abca0395f0101c2589c806a85911e21ed00172051e3c778cc9d2f996607157456cb5b3bc3d3d1d3f700ff00eaa8c026c0d4334e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-arabic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
