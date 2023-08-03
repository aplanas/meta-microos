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

PV = "2023.209.svn15878"

RPM_NAME = "texlive-biocon-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0fda88867440c085aab49b56a3084092e7467306cdcefd528ddf7c69317c7f3eccb82ac0f329150e3b1baf5e107c8eed6ac4e9db4def96a654c73206bcf128e9"
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
