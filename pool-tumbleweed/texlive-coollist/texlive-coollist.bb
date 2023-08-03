SUMMARY = "Manipulate COntent Oriented LaTeX Lists"
DESCRIPTION = "Lists are defined as a sequence of tokens separated by a comma. \
The coollist package allows the user to access certain elements \
of the list while neglecting others--essentially turning lists \
into a sort of array. List elements are accessed by specifying \
the position of the object within the list (the index of the \
item)."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.4svn63523"

RPM_NAME = "texlive-coollist-2023.209.1.4svn63523-55.1.noarch.rpm"
RPM_HASH = "e2e312b4e6d5e987081a11bb8c42872baf1bad53b5db995ffd01d465d0f326fba8ca2e9bb61fd080e0f1231561fd206051b98717538696ebb27c6a194d0cdc0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coollist.sty \
texlive-coollist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-coolstr.sty \
tex-forloop.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
