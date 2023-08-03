SUMMARY = "Typesetting programs and algorithms"
DESCRIPTION = "The main offering is a program environment; a programbox \
environment is available for fragments that must not break with \
the pages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.3.14svn44214"

RPM_NAME = "texlive-program-2023.209.3.3.14svn44214-53.1.noarch.rpm"
RPM_HASH = "376bd6abfa97ac89ae01d7d3e1401e0ff600f8cee0e603ae598bb073433f2168849f855ad9d504bb1e44b17f95fec5a6f1d59773731bd573ba3bc48ee26ac880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-program.sty \
texlive-program"

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
