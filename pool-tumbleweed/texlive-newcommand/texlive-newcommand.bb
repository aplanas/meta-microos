SUMMARY = "Generate new LaTeX command definitions"
DESCRIPTION = "Generating any other than the simple \\newcommand-style \
commands, in LaTeX, is tedious (in the least). This script \
allows the specification of commands in a 'natural' style; the \
script then generates macros to define the command."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn18704"

RPM_NAME = "texlive-newcommand-2023.201.2.0svn18704-54.1.noarch.rpm"
RPM_HASH = "2e2d8b450442547e12c139087cd87ded530c812a1bd462b7f238f981b69c04f8ccbaafbc697709c7c5845bc3be692689e6c1d2d6a04c71681aff0d4c555bd859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcommand"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
