SUMMARY = "Various BibTeX formats for journals in Chemistry"
DESCRIPTION = "Various BibTeX formats for journals in Chemistry, including \
Reviews in Computational Chemistry, Journal of Physical \
Chemistry, Journal of Computational Chemistry, and Physical \
Chemistry Chemical Physics."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-chem-journal-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "586e985bf3bcadac52a81072fa28c31460507b3ccdec29359acb475e7d7594d69c0705dac891dd95a11b783bccd169fd14d028b41619f265c3c69a6a3fb70972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chem-journal"

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
