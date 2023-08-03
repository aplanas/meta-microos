SUMMARY = "Literate programming package"
DESCRIPTION = "ProTeX is a simple but powerful literate programming tool, \
which is designed to generate useful hypertext output (either \
PDF, or HTML using TeX4ht)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn41633"

RPM_NAME = "texlive-protex-2023.209.svn41633-53.1.noarch.rpm"
RPM_HASH = "22750bfe9fe87cd53aed6be57a9eba6bd438467353820bf6b0d798f89b02074f2e0450e094887b376dc535126793bbf0203f96fa797839eae89c50ecab9ae311"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlProTex.sty \
tex-ProTex.sty \
texlive-protex"

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
