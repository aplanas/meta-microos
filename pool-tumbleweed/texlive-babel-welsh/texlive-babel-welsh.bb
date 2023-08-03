SUMMARY = "Babel support for Welsh"
DESCRIPTION = "The package provides the language definition file for Welsh. \
(Mostly Welsh-language versions of the standard names in a \
LaTeX file.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38372"

RPM_NAME = "texlive-babel-welsh-2023.209.1.1asvn38372-54.1.noarch.rpm"
RPM_HASH = "604f90d72c6c66e6e20bd69af9057857cb8e39b704dae14cf2078babbbc044c4901e69c65f7a72d35b8a71076767186e9475fe79b0d09afb758244d0f199f1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-welsh.ldf \
texlive-babel-welsh"

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
