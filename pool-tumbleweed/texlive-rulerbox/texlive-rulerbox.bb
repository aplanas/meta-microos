SUMMARY = "Draw rulers around a box"
DESCRIPTION = "This is a LaTeX package for drawing rulers around a box. This \
might be useful when showing the absolute size of something in \
electronic documents, or designating the relative scale in \
printed materials."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn50984"

RPM_NAME = "texlive-rulerbox-2023.201.1.01svn50984-53.1.noarch.rpm"
RPM_HASH = "ea961f3ffb20bd8e435597b8a0334c5687ad9e8ea7f040a0c700d8aca7f70f1f91d8bdda1be930b66b7730fefc90e32b4c6bdf0eedb75c9464f97b61072990a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rulerbox.sty) \
texlive-rulerbox"

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
