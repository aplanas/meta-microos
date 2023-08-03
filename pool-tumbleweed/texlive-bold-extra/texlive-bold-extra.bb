SUMMARY = "Use bold small caps and typewriter fonts"
DESCRIPTION = "Allows access to 'extra' bold fonts for Computer Modern OT1 \
encoding (the fonts are available in Metafont source). Since \
there is more than one bold tt-family font set, the version \
required is selected by a package option."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn17076"

RPM_NAME = "texlive-bold-extra-2023.209.0.0.1svn17076-53.1.noarch.rpm"
RPM_HASH = "9712d55d01ff90b06817cda3f431f0c706f96e47cf89bcd63164f77e4b307f7bc5e05e56559452a185b251e60072532a39245053e02fa6e9774a6e91ab387f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bold-extra.sty \
texlive-bold-extra"

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
