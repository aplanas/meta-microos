SUMMARY = "Extending \\hrulefill"
DESCRIPTION = "The package provides extended macros for the default \\hrulefill \
command. It allows modification of the width and the colour of \
the line."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn22575"

RPM_NAME = "texlive-xhfill-2023.201.1.01svn22575-52.2.noarch.rpm"
RPM_HASH = "24c6f558aefc9489e05b8fd2f920b6597c11c37daa0278dfe879a865e10309ae3c91bce83077d78e12d58baee9d71e634dd08f291db9eae83229469cdab36566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xhfill.sty \
texlive-xhfill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
