SUMMARY = "An implementation of the Gotoh sequence alignment algorithm"
DESCRIPTION = "This package calculates biological sequence alignment with the \
Gotoh algorithm. The package also provides an interface to \
control various settings including algorithm parameters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44764"

RPM_NAME = "texlive-gotoh-2023.209.1.1svn44764-54.2.noarch.rpm"
RPM_HASH = "ae41b213a67f5fcae1ccdb24f8ee53b24c4ccd38585f89d339f7bf078e5b45dfffc9a0a67b68185bdf52e38a3a5c3bd0856cafd8638e2a07f8a3268671db2fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gotoh.sty \
texlive-gotoh"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
