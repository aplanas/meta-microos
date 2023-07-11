SUMMARY = "Extremely configurable ellipses with formats for various style manuals"
DESCRIPTION = "The xellipsis package provides a system for configuring \
(almomst) every possible aspect of ellipses, including \
preceding and proceeding characters; the character itself; \
distances before and after each of these; and number of \
characters. It comes with both a compatibility option for \
standard LaTeX \\ldots as well as preset package options for the \
Chicago Manual of Style (Turabian); the Bluebook; and MLA \
guidelines."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn47546"

RPM_NAME = "texlive-xellipsis-2023.201.2.0svn47546-52.2.noarch.rpm"
RPM_HASH = "470f35b8b775bb4d9b14a85dc3be74cae818459d871e59a5d552d4b5416a87721d55160e6e3bd13fe0c3f90ef08c2bdd6afcf8557c8adf8b2aa50471294b872b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xellipsis.sty \
texlive-xellipsis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
