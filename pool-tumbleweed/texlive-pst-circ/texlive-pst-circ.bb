SUMMARY = "PSTricks package for drawing electric circuits"
DESCRIPTION = "The package is built using PSTricks and in particular pst-node. \
It can easily draw current 2-terminal devices and some 3- and \
4-terminal devices used in electronic or electric theory. The \
package's macros are designed with a view to 'logical' \
representation of circuits, as far as possible, so as to \
relieve the user of purely graphical considerations when \
expressing a circuit."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.19svn60464"

RPM_NAME = "texlive-pst-circ-2023.201.2.19svn60464-52.1.noarch.rpm"
RPM_HASH = "62420d90f1d39bc3d88d9148cc5fb3e490a793379950cd62e795e140dd9e221b79b6cb315bf889b0093a34be29a2d9023c69b95bbc823e83e78f8b5e89ebefec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-circ.sty) \
tex(pst-circ.tex) \
texlive-pst-circ"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
