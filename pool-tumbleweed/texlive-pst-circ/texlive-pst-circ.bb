SUMMARY = "PSTricks package for drawing electric circuits"
DESCRIPTION = "The package is built using PSTricks and in particular pst-node. \
It can easily draw current 2-terminal devices and some 3- and \
4-terminal devices used in electronic or electric theory. The \
package's macros are designed with a view to 'logical' \
representation of circuits, as far as possible, so as to \
relieve the user of purely graphical considerations when \
expressing a circuit."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.19svn60464"

RPM_NAME = "texlive-pst-circ-2023.209.2.19svn60464-53.1.noarch.rpm"
RPM_HASH = "fb39c3efb2e28818cedf5afc8a406989103c88edafc0df45c3112db33beb2fa19f557bf4c3abed7bbd9de3f8cbe2faa1e09b2192056dbaf94a006ec34cf8d04e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-circ.sty \
tex-pst-circ.tex \
texlive-pst-circ"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
