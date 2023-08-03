SUMMARY = "Check used commands"
DESCRIPTION = "The package keeps track of whether a command defined in a \
document preamble is actually used somewhere in the document. \
After the package is loaded in the preamble of a document, all \
\\newcommand (and similar command definitions) between that \
point and the beginning of the document will be marked for \
logging. At the end of the document a report of command usage \
will be printed in the TeX log, for example: 'mdash was used on \
line 25'; 'ndash was never used'."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28910"

RPM_NAME = "texlive-cmdtrack-2023.209.svn28910-54.1.noarch.rpm"
RPM_HASH = "40dbe5973aefe842a9b886afff0aa1c30377e9c40b76da7feba807c48e8755839f1ee1aa9f9d1f597b250a33928fb107c1e9ca5edd97eaaf27b228a5dd34bd9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmdtrack.sty \
texlive-cmdtrack"

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
