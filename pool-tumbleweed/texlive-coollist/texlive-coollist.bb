SUMMARY = "Manipulate COntent Oriented LaTeX Lists"
DESCRIPTION = "Lists are defined as a sequence of tokens separated by a comma. \
The coollist package allows the user to access certain elements \
of the list while neglecting others--essentially turning lists \
into a sort of array. List elements are accessed by specifying \
the position of the object within the list (the index of the \
item)."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.204.1.4svn63523"

RPM_NAME = "texlive-coollist-2023.204.1.4svn63523-54.1.noarch.rpm"
RPM_HASH = "daf28d83f66ca0810af4a02b61332582b41c66b87f3de64bc6fed8167bed010284d7fd38710d9ccb0cfe8135494fec91e0709cb71c3c84fb6988aae783743331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(coollist.sty) \
texlive-coollist"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(coolstr.sty) \
tex(forloop.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
