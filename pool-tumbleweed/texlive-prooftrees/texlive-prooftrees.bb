SUMMARY = "Forest-based proof trees (symbolic logic)"
DESCRIPTION = "The package supports drawing proof trees of the kind often used \
in introductory logic classes, especially those aimed at \
students without strong mathemtical backgrounds. Hodges (1991) \
is one example of a text which uses this system. When teaching \
such a system it is especially useful to annotate the tree with \
line numbers, justifications and explanations of branch \
closures. prooftrees provides a single environment, prooftree, \
and a variety of tools for annotating, customising and \
highlighting such trees. A cross-referencing system is provided \
for trees which cite line numbers in justifications for proof \
lines or branch closures. prooftrees is based on forest and, \
hence, TikZ. The package requires version 2.0.2 of Forest for \
expected results and will not work with version 1."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7_svn_8641svn52221"

RPM_NAME = "texlive-prooftrees-2023.201.0.0.7_svn_8641svn52221-52.1.noarch.rpm"
RPM_HASH = "dbdac19136a002c8f121932d20158d80e9163df7c2e99d3d39fa779a91dd981fa731e329b9a176eaf224546836b804802019a422672237afd71920a61e7db6cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prooftrees.sty \
texlive-prooftrees"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-forest.sty \
tex-svn-prov.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
