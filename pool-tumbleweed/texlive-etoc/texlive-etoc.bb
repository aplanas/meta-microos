SUMMARY = "Completely customisable TOCs"
DESCRIPTION = "With etoc loaded, \\tableofcontents can be used multiple times, \
and an added command \\localtableofcontents allows to typeset \
'local' tables of contents, i.e. TOCs having their scope \
limited to the last sectioning command encountered. Since \
release 1.2, also \\locallistoffigures and \\locallistoftables \
are available. Loading etoc per itself does not modify the \
'contents lines' inherited from the class default or changed \
via other packages. But full usage of the package allows \
spectacular effects such as displaying TOCs as trees or mind \
maps."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn66299"

RPM_NAME = "texlive-etoc-2023.209.1.2svn66299-53.1.noarch.rpm"
RPM_HASH = "77d0bc41806a3606d5925e928e8ad3b90bf5576a9c4aa834689cc932d71a2baeeeb52f6fd9454b90c39fc16b5370450098ae5c8b90c2692f2a438c963968624a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etoc.sty \
texlive-etoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
