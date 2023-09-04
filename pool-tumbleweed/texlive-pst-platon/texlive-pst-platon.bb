SUMMARY = "Platonic solids in PSTricks"
DESCRIPTION = "The package adds to PSTricks the ability to draw 3-dimensional \
views of the five Platonic solids."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-2023.209.0.0.01svn16538-54.2.noarch.rpm"
RPM_HASH = "86d5718b049c1dd38928c11470d104fc5db100be5c3804ec2b0bedb911c587e112e6c19c8e22c5e33ac882f66eca671957a7db653a5aef1f00afbba879ac776a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-platon.sty \
texlive-pst-platon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-3d.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
