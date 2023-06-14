SUMMARY = "Babel support for Welsh"
DESCRIPTION = "The package provides the language definition file for Welsh. \
(Mostly Welsh-language versions of the standard names in a \
LaTeX file.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn38372"

RPM_NAME = "texlive-babel-welsh-2023.201.1.1asvn38372-53.1.noarch.rpm"
RPM_HASH = "1ac1f9d2ecaad0c9025173d5079a78ef8d68b339757cafc4cf82a46c7162adeb33b8033da7db35ab13c8cc47ae5d0236f8440831c2e640e3e5f5f63709406332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-welsh.ldf \
texlive-babel-welsh"

RDEPENDS:${PN} += "/bin/sh \
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
