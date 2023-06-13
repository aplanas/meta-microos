SUMMARY = "Integer calculations on very large numbers"
DESCRIPTION = "This package provides expandable arithmetic operations with big \
integers that can exceed TeX's number limits."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn53172"

RPM_NAME = "texlive-bigintcalc-2023.201.1.5svn53172-53.1.noarch.rpm"
RPM_HASH = "a8267fbf6fa22892472ad05da3051f2743e3c001d3a7e6092376001d12f364a3e62f4656ca519307b16fbec1bb60d9d8e136225d2c73a3c714c02e66cb7534c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bigintcalc.sty) \
texlive-bigintcalc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pdftexcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
