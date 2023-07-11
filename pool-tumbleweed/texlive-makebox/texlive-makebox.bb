SUMMARY = "Defines a \\makebox* command"
DESCRIPTION = "Define a \\makebox* command that does the same as a \\makebox \
command, except that the width is given by a sample text \
instead of an explicit length measure."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn15878"

RPM_NAME = "texlive-makebox-2023.208.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "79b2a344a4a6cdd2df8ebea59c7b03eb5480b1c21658fc69a4b56920e09eef158afc6fe6e3fcc8561c5069f81707d9478b0d2b77562a59abf0b9a17408146605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makebox.sty \
texlive-makebox"

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
