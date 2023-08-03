SUMMARY = "Expandable macros that take an optional argument"
DESCRIPTION = "Commands that take an optional argument are not ordinarily \
expandable; this package allows such commands to be expandable \
provided that they have at least one mandatory argument."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-xoptarg-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "2b419fd4907be63735b1caf06b41a621acaa53d0259981db2fc0d0b455072c5059d090e7c161d8bb26caf4116a8eba795864e8a7ab398b4aecd1684da81308cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xoptarg.sty \
texlive-xoptarg"

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
