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

PV = "2023.201.1.2svn66299"

RPM_NAME = "texlive-etoc-2023.201.1.2svn66299-52.1.noarch.rpm"
RPM_HASH = "9ef1474c2337985a6dcd37d28874ca7e14c3259f64468acd75b92e877ddf4b59c099a98090bb8707d53bebf7009d53ce7de9d382ed004bf53e015c5615d217ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(etoc.sty) \
texlive-etoc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(multicol.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
