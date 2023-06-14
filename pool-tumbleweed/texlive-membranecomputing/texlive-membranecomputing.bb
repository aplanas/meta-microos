SUMMARY = "Membrane Computing notation"
DESCRIPTION = "This is a LaTeX package for the Membrane Computing community. \
It comprises the definition of P systems, rules and some \
concepts related to languages and computational complexity \
usually needed for Membrane Computing research. The package \
depends on ifthen and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn64627"

RPM_NAME = "texlive-membranecomputing-2023.201.0.0.2.1svn64627-52.1.noarch.rpm"
RPM_HASH = "58f3dce9456d46dcf7f2196ea4eafb8e1bf347106d576041f4cae51869fbc54bb62e765cd946dfe6cbeeb456a7566c093a1abd91100aba2f65e82083320d7ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-membranecomputing.sty \
texlive-membranecomputing"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
