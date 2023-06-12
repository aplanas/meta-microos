SUMMARY = "Declare active character substitution, robustly"
DESCRIPTION = "The package provides macros \\DeclareRobustActChar and \
\\ReDeclareRobActChar. One uses \\DeclareRobustActChar in the \
same way one would use \\DeclareRobustCommand; the macro \
\\protects the active character when it appears in a moving \
argument. \\ReDeclareRobActChar redefines an active character \
previously defined with \\DeclareRobustActChar, in the same way \
that \\renewcommand works for ordinary commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn15878"

RPM_NAME = "texlive-drac-2023.201.1svn15878-52.1.noarch.rpm"
RPM_HASH = "9105038b4c28817ffefcd437d8231c02e13420cd7dfce3c392f0e15428343d4269e52ae6aed3b4ed361b23a16ca57a284527623167c18492c803a16a9c88be66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(drac.sty) \
texlive-drac"
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
