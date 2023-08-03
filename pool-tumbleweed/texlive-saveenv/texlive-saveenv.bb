SUMMARY = "Save environment content verbatim"
DESCRIPTION = "This package provides tools to create your own verbatim \
environments, and works for all values of \\endlinechar."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn65346"

RPM_NAME = "texlive-saveenv-2023.209.0.0.0.1svn65346-54.1.noarch.rpm"
RPM_HASH = "5e50b6388f0d8a8d30eeef2a470667b221a75a7f7c00b10ebd37076870fb06ea7b0bb48a3b2462080c2f518ca0bc77ea3a85d2dc11afa7d6399543d1f0e2731d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-saveenv.sty \
texlive-saveenv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-precattl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-precattl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
