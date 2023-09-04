SUMMARY = "Pre-commit git hook for LaTeX package developpers"
DESCRIPTION = "This package provides a pre-commit git hook to check basic \
LaTeX syntax for the use of package developers. It is installed \
by copying it into the .git/.hooks file. It then checks the \
following file types: .sty, .dtx, .bbx, .cbx, and .lbx. List of \
performed checks: Each line must be terminated by a %, without \
a space before it. Empty lines are allowed, but not lines with \
nothing but spaces in them. \\begin{macro} and \\end{macro} must \
be paired. \\begin{macrocode} and \\end{macrocode} must be \
paired. \\begin{macro} must have a second argument. One space \
must be printed between % and \\begin{macro} or \\end{macro}. % \
must be the first character in the line. Four spaces must be \
printed between % and \\begin{macrocode} or \\end{macrocode}. \\cs \
argument must not start with a backslash."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.2svn41378"

RPM_NAME = "texlive-hook-pre-commit-pkg-2023.209.1.1.2svn41378-54.2.noarch.rpm"
RPM_HASH = "39281b64f4e878fe19c768b79e4619d38f0323ad0ca5c9ae302c2b4a856189f242f117e0d14f357329b03f6ea4be7e7c53cf7400ac875faa031645d15884e658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hook-pre-commit-pkg"

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
