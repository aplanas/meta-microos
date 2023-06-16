SUMMARY = "Several versions of output from the same source"
DESCRIPTION = "This package allows to generate several versions of the same \
document for different audiences."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn60688"

RPM_NAME = "texlive-multiaudience-2023.201.1.04svn60688-54.1.noarch.rpm"
RPM_HASH = "9efc5f12a2d42bd6389432be2f73bdc0d4a1ccf93727422231d9ce7ef5a1e495b0dcea7ba8c4f4dc9fe6f6d9d39279f1b87f8f5d411143e807a799613694a69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multiaudience.sty \
texlive-multiaudience"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
