SUMMARY = "Flexible and configurable page range typesetting"
DESCRIPTION = "The package defines a command \\pagerange that typesets ranges \
of page numbers, expanding them (e.g., adding first or last \
page numbers) and standardising them."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn16915"

RPM_NAME = "texlive-pagerange-2023.209.0.0.5svn16915-52.1.noarch.rpm"
RPM_HASH = "5e811742d3457104cb4208f4b29fab791268a633a8c064dc3a44a8712f82a8939c70adee6fe0006b3218e46b23b92d992d2a48fb5fc265db65ab93d1cd518141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagerange-guide.cfg \
tex-pagerange.sty \
texlive-pagerange"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lastpage.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
