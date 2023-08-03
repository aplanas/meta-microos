SUMMARY = "LaTeX macros for Linguistics"
DESCRIPTION = "Numerous minor LaTeX enhancements for linguistics, including \
multiple accents on the same letter, interline glosses \
(word-by-word translations), Discourse Representation \
Structures, and example numbering."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8svn64241"

RPM_NAME = "texlive-covington-2023.209.2.8svn64241-55.1.noarch.rpm"
RPM_HASH = "f8b73bac2362a7b717b8b01990785bb5fc8b80c62e1c75333819f7524d92a6e7d40e74520329273c4dc53ae007783aa6b17354d87acd12e6c7b5f5229f6bdd36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-covington.sty \
texlive-covington"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
