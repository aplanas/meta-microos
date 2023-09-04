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

PV = "2023.209.2.0svn47546"

RPM_NAME = "texlive-xellipsis-2023.209.2.0svn47546-53.2.noarch.rpm"
RPM_HASH = "3483149c1f8dfe951a3d296e2463f1e92c68e15bc447cfb46ba02283adfc35bfd15f693b80c97d776254f83af304b8b1a64c99e4c6193afb8f3dd53a8473835f"
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
