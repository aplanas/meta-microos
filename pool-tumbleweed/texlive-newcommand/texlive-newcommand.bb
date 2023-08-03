SUMMARY = "Generate new LaTeX command definitions"
DESCRIPTION = "Generating any other than the simple \\newcommand-style \
commands, in LaTeX, is tedious (in the least). This script \
allows the specification of commands in a 'natural' style; the \
script then generates macros to define the command."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn18704"

RPM_NAME = "texlive-newcommand-2023.209.2.0svn18704-55.1.noarch.rpm"
RPM_HASH = "5cb290d9aed36ed348a7ec1823f7e8d73b7709da892223a21fb4ba772a1cbd5ff2fef520777576da1e10d86e0edf0540f049a3dddfdced19ca0360b7658413b7"
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
