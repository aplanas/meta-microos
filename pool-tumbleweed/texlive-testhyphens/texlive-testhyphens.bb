SUMMARY = "Testing hyphenation patterns"
DESCRIPTION = "The package may be used for testing hyphenation patterns or for \
controlling that specific words are hyphenated as expected. \
This package implements some old TUGboat code to adapt it to \
LaTeX with some enhancements. It differs form \\showhyphens, \
because it typesets its output on the document's output file. \
It also works with xelatex, where \\showhyphens requires a \
workaround."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn38928"

RPM_NAME = "texlive-testhyphens-2023.209.0.0.7svn38928-55.1.noarch.rpm"
RPM_HASH = "1210aa99ae9ef94154ed0ba1fc8e83321563d938a67dd0e544d2d876d923ebb4ec95ea5b2c48025f414f426f3ed59ba653ee72e84512ed799c7fec38efcade33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-testhyphens.sty \
texlive-testhyphens"

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
