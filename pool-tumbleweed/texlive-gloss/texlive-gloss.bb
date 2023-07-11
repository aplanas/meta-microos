SUMMARY = "Create glossaries using BibTeX"
DESCRIPTION = "A glossary package using BibTeX with \\cite replaced by \\gloss."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2svn15878"

RPM_NAME = "texlive-gloss-2023.201.1.5.2svn15878-53.2.noarch.rpm"
RPM_HASH = "37398337400f86e90049041dbc607d314b6ce01bc6cd34f54e69691be85fd0aa036221da9d16f26fd41f7bb6b36568f33f261032251187bdc23be0775bc338d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gloss.sty \
texlive-gloss"

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
