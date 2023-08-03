SUMMARY = "Babel contrib support for Bosnian"
DESCRIPTION = "The package provides a language definition file that enables \
support of Bosnian with babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38174"

RPM_NAME = "texlive-babel-bosnian-2023.209.1.1svn38174-54.1.noarch.rpm"
RPM_HASH = "72b70c6fc18ab6318fc853083c3b00ac5b8d4b987f37408c2579e3d38dbb58d3435c057a8d1f89a73f7f28af2eac9cbbd4b73812430976b3bfb5159b450d8105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bosnian.ldf \
texlive-babel-bosnian"

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
