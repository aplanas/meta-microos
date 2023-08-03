SUMMARY = "Extract a BibTeX file based on a .aux file"
DESCRIPTION = "A Bourne shell script that uses BibTeX to extract bibliography \
entries that are \\cite'd in a document. It can also expand a \
BibTeX file, expanding the abbreviations (other than the \
built-in ones like month names) and following the \
cross-references."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.03svn50677"

RPM_NAME = "texlive-bibexport-2023.209.3.03svn50677-54.1.noarch.rpm"
RPM_HASH = "75e904b7fa92363150aad8fc47a2167865230c67458cdd801e0703ac4b13e362df34e344044260a26c378c5188e864da8217aa51275c34e8b4e45e8eed73a96d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibexport"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-bibexport-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
