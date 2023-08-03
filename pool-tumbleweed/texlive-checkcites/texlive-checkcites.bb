SUMMARY = "Check citation commands in a document"
DESCRIPTION = "The package provides a lua script written for the sole purpose \
of detecting undefined and unused references from LaTeX \
auxiliary or bibliography files."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn64155"

RPM_NAME = "texlive-checkcites-2023.209.2.6svn64155-54.1.noarch.rpm"
RPM_HASH = "02cf34a18217cfc55eb1d6e42693aecd044280105c3c5a7257bf7bbf3b246854b69cff097a44fcdb0ab91c7fa04fbcc28379974ac3574f8bf79d054b11f71fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkcites"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-checkcites-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
