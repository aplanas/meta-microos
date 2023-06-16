SUMMARY = "Redefine symbols where names conflict"
DESCRIPTION = "There are a number of symbols (e.g., \\Square) that are defined \
by several packages. In order to typeset all the variants in a \
document, we have to give the glyph a unique name. To do that, \
we define \\savesymbol{XXX}, which renames a symbol from \\XXX to \
\\origXXX, and \\restoresymbols{yyy}{XXX}, which renames \\origXXX \
back to \\XXX and defines a new command, \\yyyXXX, which \
corresponds to the most recently loaded version of \\XXX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn31565"

RPM_NAME = "texlive-savesym-2023.201.1.2svn31565-53.1.noarch.rpm"
RPM_HASH = "75342ff53efcc879f75643e4bdd4aa6aae6a87257a4ce6ca860dcf5db0046d0f2f409551812cf8b12132be11cfcd41d053c5ab4586694acc129b504735cdeeff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-savesym.sty \
texlive-savesym"

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
