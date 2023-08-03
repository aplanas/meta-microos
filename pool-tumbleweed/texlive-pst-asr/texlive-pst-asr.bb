SUMMARY = "Typeset autosegmental representations for linguists"
DESCRIPTION = "The package allows the user to typeset autosegmental \
representations. It uses the PStricks, and xkeyval packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn22138"

RPM_NAME = "texlive-pst-asr-2023.209.1.3svn22138-53.1.noarch.rpm"
RPM_HASH = "293f3f9f3d428146a195381ae454b231f6db8a670076a382376135998df81a536e430fbb870e23a97c140e421f9eb993a45a40c84cc3d8879d7fd2d4d7a9c9e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-asr.sty \
tex-pst-asr.tex \
texlive-pst-asr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
