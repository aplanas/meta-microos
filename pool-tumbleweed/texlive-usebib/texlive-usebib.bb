SUMMARY = "A simple bibliography processor"
DESCRIPTION = "The package is described by its author as 'a poor person's \
replacement for the more powerful methods provided by BibLaTeX \
to access data from a .bib file'. Its principle commands are \
\\bibinput (which specifies a database to use) and \\usebibdata \
(which typesets a single field from a specified entry in that \
database."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn25969"

RPM_NAME = "texlive-usebib-2023.209.1.0asvn25969-54.1.noarch.rpm"
RPM_HASH = "fe9c64d58442ebe01ff5cf1964c048ff0c8860809d8b173b9480361623074450b9353e69c7fcde04036648a88d2228c2be7c94f8509101d1e6d6c65931cb0961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-usebib.sty \
texlive-usebib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
