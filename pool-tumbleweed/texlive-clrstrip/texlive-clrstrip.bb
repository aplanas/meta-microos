SUMMARY = "Place contents into a full width colour strip"
DESCRIPTION = "This lightweight package provides the colorstrip environment, \
that places its contents into a full page width colour strip."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60363"

RPM_NAME = "texlive-clrstrip-2023.201.svn60363-53.1.noarch.rpm"
RPM_HASH = "fa0b3091e285f2c504d52d1622131fb50574d1f5fb8bc895fde93d52d9754f86e69ba0626833b28fbb1ff106231e09a22a5c024a819b010ce7060cf8915cd15c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrstrip.sty \
texlive-clrstrip"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
