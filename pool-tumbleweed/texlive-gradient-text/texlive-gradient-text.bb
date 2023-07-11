SUMMARY = "Decorate text with linear gradient colors"
DESCRIPTION = "This package enables writers to conveniently decorate text with \
linear gradient colors. The RGB values of the first and the \
last character are specified as parameters while the rest of \
the text is colored automatically."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65567"

RPM_NAME = "texlive-gradient-text-2023.201.1.2svn65567-53.2.noarch.rpm"
RPM_HASH = "c17cf38fbc7419689e07f04642e2a58a7f73de519ec2b335e4c8e33b0f7ac0650728086c66ba6a4d80b2e5917ebff5b606950b201ee258c4ba0401cfa1f01f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradient-text.sty \
texlive-gradient-text"

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
