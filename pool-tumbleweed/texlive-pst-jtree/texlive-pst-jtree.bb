SUMMARY = "Typeset complex trees for linguists"
DESCRIPTION = "jTree uses PSTricks to enable linguists to typeset complex \
trees. The package requires use of PStricks (of course) and \
xkeyval packages. jTree is a development of, and replacement \
for, the jftree package, which is no longer available."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn20946"

RPM_NAME = "texlive-pst-jtree-2023.209.2.6svn20946-53.1.noarch.rpm"
RPM_HASH = "6333034f8d40490cc5cf93b67f53658714e008a57922320a94c097a59412377b8b107950734badb39302b89776577f4d5557aac1be42fad70702ca1a70f71276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-jtree.sty \
tex-pst-jtree.tex \
texlive-pst-jtree"

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
