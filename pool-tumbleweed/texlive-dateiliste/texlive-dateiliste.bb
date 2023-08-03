SUMMARY = "Extensions of the \\listfiles concept"
DESCRIPTION = "The package provides a file list (similar to that offered by \
\\listfiles), neatly laid out as a table. The main document can \
be included in the list, and a command is available for \
providing RCS-maintained data for printing in the file list."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn27974"

RPM_NAME = "texlive-dateiliste-2023.209.0.0.6svn27974-55.1.noarch.rpm"
RPM_HASH = "a544a2b7cf9cfab4afb54faa4c57ee5aac76b115213023e5c41c925774f326eec65267ac4b74fc2291bd36ecadd2fbb41c9780dbec831ddf4ee3c42280fccd66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dateiliste.sty \
texlive-dateiliste"

RDEPENDS:${PN} += "/usr/bin/sh \
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
