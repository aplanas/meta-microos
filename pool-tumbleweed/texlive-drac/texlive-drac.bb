SUMMARY = "Declare active character substitution, robustly"
DESCRIPTION = "The package provides macros \\DeclareRobustActChar and \
\\ReDeclareRobActChar. One uses \\DeclareRobustActChar in the \
same way one would use \\DeclareRobustCommand; the macro \
\\protects the active character when it appears in a moving \
argument. \\ReDeclareRobActChar redefines an active character \
previously defined with \\DeclareRobustActChar, in the same way \
that \\renewcommand works for ordinary commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn15878"

RPM_NAME = "texlive-drac-2023.209.1svn15878-53.1.noarch.rpm"
RPM_HASH = "0a802b4708f4808d6ffb7fe50cdfbf5b2d2ce289f1cd0ebb710b8d2b71d29b84d721dc1e8c668d6aff29a322ea5408b8daf293eecaa2b1c74841b54c5ceab06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drac.sty \
texlive-drac"

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
