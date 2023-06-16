SUMMARY = "Typesetting biological species names"
DESCRIPTION = "The biocon--biological conventions--package aids the \
typesetting of some biological conventions. At the moment, it \
makes a good job of typesetting species names (and ranks below \
the species level). A distinction is made between the Plant, \
Fungi, Animalia and Bacteria kingdoms. There are default \
settings for the way species names are typeset, but they can be \
customized. Different default styles are used in different \
situations."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-biocon-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "2657dea403a93e74c325897c92a90043541b8252f8bcfc6aa69689844e8ec1ce48ba5af7c796eb9e2aee28a31ba4f81996f58081a8a42c2a9efa6d15a5204806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biocon-old.sty \
tex-biocon.sty \
texlive-biocon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
