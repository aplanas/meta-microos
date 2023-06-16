SUMMARY = "Macros to use the Symbats3 dingbats fonts"
DESCRIPTION = "This package makes available for LaTeX the glyphs in Feorag's \
OpenType Symbats3 neopagan dingbats fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63833"

RPM_NAME = "texlive-symbats3-2023.201.svn63833-57.1.noarch.rpm"
RPM_HASH = "f635dde18b318ee35fe19030b8c24b4aa72fdf434728851e26fc9baeb8cf0d3e355d8ff1f259a0a87354aaad301ad12652d143aa5edbc2c2b7b89a03b96fde6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-symbats3.sty \
texlive-symbats3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
