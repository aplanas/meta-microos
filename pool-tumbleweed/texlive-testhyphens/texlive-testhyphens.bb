SUMMARY = "Testing hyphenation patterns"
DESCRIPTION = "The package may be used for testing hyphenation patterns or for \
controlling that specific words are hyphenated as expected. \
This package implements some old TUGboat code to adapt it to \
LaTeX with some enhancements. It differs form \\showhyphens, \
because it typesets its output on the document's output file. \
It also works with xelatex, where \\showhyphens requires a \
workaround."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn38928"

RPM_NAME = "texlive-testhyphens-2023.201.0.0.7svn38928-54.1.noarch.rpm"
RPM_HASH = "a513daeb5e4e03d7af63693c20e52a29d0adf27fd64c284f7e555664bb7eb74a1dfedd8b803d21f9d3d3cd6d7ee96827f730e2a9fb5cc009891e28fe6ad3f332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(testhyphens.sty) \
texlive-testhyphens"
RDEPENDS:${PN} += "/bin/sh \
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
