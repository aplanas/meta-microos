SUMMARY = "Extension of the bbold package with a Blackboard Bold alphabet"
DESCRIPTION = "Extension of bbold to a package with three weights, of which \
the original is considered as light and the additions as \
regular and bold."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.032svn65424"

RPM_NAME = "texlive-bboldx-2023.209.1.032svn65424-54.1.noarch.rpm"
RPM_HASH = "9f1337606f80de8b4122cb58993cbbe6f591722b4a696718b985764e624901b9d9a2e5d98df9ae168a07d3d3f10c35dd2f35507d44706021f69fceb93eb5eaef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BBOLDX-Bold.tfm \
tex-BBOLDX-Regular.tfm \
tex-BBOLDX-Thin.tfm \
tex-Ubboldx.fd \
tex-bboldx.enc \
tex-bboldx.map \
tex-bboldx.sty \
texlive-bboldx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-bboldx-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
