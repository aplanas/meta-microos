SUMMARY = "Extensions of the \\listfiles concept"
DESCRIPTION = "The package provides a file list (similar to that offered by \
\\listfiles), neatly laid out as a table. The main document can \
be included in the list, and a command is available for \
providing RCS-maintained data for printing in the file list."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.6svn27974"

RPM_NAME = "texlive-dateiliste-2023.204.0.0.6svn27974-54.1.noarch.rpm"
RPM_HASH = "1e909e3812497597efd00ec1110834a3f32d246f168b7088f346c7e57ebc31bd2135b598b14edea05b30b413b1c5edb677167a66c4eead32d5174e71c876042d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dateiliste.sty \
texlive-dateiliste"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxtable.sty \
tex-rcsinfo.sty \
tex-svninfo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
