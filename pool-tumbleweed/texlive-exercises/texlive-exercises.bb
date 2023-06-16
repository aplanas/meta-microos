SUMMARY = "Typeset exercises and solutions with automatic addition of points"
DESCRIPTION = "This package defines the environments exercise and solution. \
The layout of these environments can be customized. The -- \
optional -- points in the exercises can be added automatically. \
The package also permits to hide the solutions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn55188"

RPM_NAME = "texlive-exercises-2023.201.1.1svn55188-52.1.noarch.rpm"
RPM_HASH = "5162c5270c278b1a925960b765ec2ef2a2490ce22d87fe887277a39f9cca5cb1b6a65a87e67c6106ed27b46ac9a4f56d41f078b831e2d10fe9ba90d0b7cd53ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercises.sty \
texlive-exercises"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
