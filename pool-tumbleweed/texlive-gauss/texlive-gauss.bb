SUMMARY = "A package for Gaussian operations"
DESCRIPTION = "The gauss package provides configurable tools for producing row \
and column operations on matrices (a.k.a. Gaussian operations)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32934"

RPM_NAME = "texlive-gauss-2023.201.svn32934-52.1.noarch.rpm"
RPM_HASH = "a8b5309f21f7ad53790fe159201aba1b95d76f61cdca2b8559341c48f24aa6b92a00acfef0701b633b8849a58fbb132c0d192784ea09849cd1a2430fa7cbe1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gauss.sty \
texlive-gauss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
