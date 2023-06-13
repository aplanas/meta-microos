SUMMARY = "Various BibTeX formats for journals in Chemistry"
DESCRIPTION = "Various BibTeX formats for journals in Chemistry, including \
Reviews in Computational Chemistry, Journal of Physical \
Chemistry, Journal of Computational Chemistry, and Physical \
Chemistry Chemical Physics."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-chem-journal-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "56d3b97caf2f745185e6d7fb24c742457f00c9e026ceac4f583fe652b1e8f56de793b617876c27826699666e0201319d6719acedf6269e1fd6a164ff85e4e6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chem-journal"

RDEPENDS:${PN} += "/bin/sh \
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
