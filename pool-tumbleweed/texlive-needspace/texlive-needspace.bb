SUMMARY = "Insert pagebreak if not enough space"
DESCRIPTION = "Provides commands to disable pagebreaking within a given \
vertical space. If there is not enough space between the \
command and the bottom of the page, a new page will be started."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3dsvn29601"

RPM_NAME = "texlive-needspace-2023.201.1.3dsvn29601-54.1.noarch.rpm"
RPM_HASH = "e41516481dcdb97f5b9633a1ddbabfdd06e6477cd89f7fa9433e9a87471acda5d25f7a77925b2bf9154301c85c8b66b74ab837d46e1fde00b7df06ecc896d236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(needspace.sty) \
texlive-needspace"
RDEPENDS:${PN} += "/bin/sh \
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
