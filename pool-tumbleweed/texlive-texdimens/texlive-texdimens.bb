SUMMARY = "Conversion of TeX dimensions to decimals"
DESCRIPTION = "Utilities and documentation related to TeX dimensional units, \
usable both with Plain (\\input texdimens) and with LaTeX \
(\\usepackage{texdimens})."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn61070"

RPM_NAME = "texlive-texdimens-2023.209.1.1svn61070-55.1.noarch.rpm"
RPM_HASH = "89fa46286a5c4e69fcb39ef364f744149291190c7d4823d3e29ec159fe192b9c79dbb2419adf4b8949d3dbd2061584d1e10bf29608ab171ab2db66aa8c1172cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdimens.sty \
tex-texdimens.tex \
texlive-texdimens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
