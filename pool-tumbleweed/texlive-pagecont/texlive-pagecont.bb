SUMMARY = "Page numbering that continues between documents"
DESCRIPTION = "The package provides the facility that several documents can be \
typeset independently with page numbers in sequence, as if they \
were a single document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pagecont-2023.209.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "bbe9012cf716072ce2957b2cc9949b2a72f741c28867ab83c735ca53519d815bc5affb08ddb721dd2e16aecad2e022c454c3b2a6bfc5653280c830fea91e7b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagecont.sty \
texlive-pagecont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
