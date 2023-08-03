SUMMARY = "Several versions of output from the same source"
DESCRIPTION = "This package allows to generate several versions of the same \
document for different audiences."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn60688"

RPM_NAME = "texlive-multiaudience-2023.209.1.04svn60688-55.1.noarch.rpm"
RPM_HASH = "6913f350e49a666d1ef77cdcae923e52893dde0fcdda7fe9e3c98d665c22e02eecd58b0b7301ce60512a999d90dc72f9f520226aea7149d0adf284175fce8bea"
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
