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

PV = "2023.209.0.0.7_svn_8641svn52221"

RPM_NAME = "texlive-prooftrees-2023.209.0.0.7_svn_8641svn52221-53.1.noarch.rpm"
RPM_HASH = "fbb2c786e4df90d9ce5d4c943428179aee1c97726229bce0c8b55345bb11cdf5770c342ba63b71de0e8a90c7903f05e34b819543b754cf8cecfe6f2ba1a2967f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prooftrees.sty \
texlive-prooftrees"

RDEPENDS:${PN} += "/usr/bin/sh \
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
