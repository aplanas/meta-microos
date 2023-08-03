SUMMARY = "Save the optional argument of \\item"
DESCRIPTION = "The package modifies \\item commands to save the optional \
argument in a box."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn22136"

RPM_NAME = "texlive-sitem-2023.209.1.0svn22136-58.1.noarch.rpm"
RPM_HASH = "3f26c92b1b22dc9dbe32ae191a5e97643dc43febaace53c69d724c1550740d48866820e0612005d40a22516efcbf49495a6f369a5b6b91b01c9b8773b85892ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sitem.sty \
texlive-sitem"

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
