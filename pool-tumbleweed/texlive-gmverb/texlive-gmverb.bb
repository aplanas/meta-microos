SUMMARY = "A variant of LaTeX \\verb, verbatim and shortvrb"
DESCRIPTION = "A redefinition of \\verb and verbatim so that long lines are \
breakable before \\ and after { with % as 'hyphen'. Allows you \
to define your own verbatim-like environments (subject to a \
size limit) and allows you to declare any single character as a \
shorthand as in the \\MakeShortVerb command of the shortvrb \
package of the LaTeX distribution. The package depends on the \
gmutils package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-2023.209.0.0.98svn24288-54.2.noarch.rpm"
RPM_HASH = "272379c9ce966f3dc7843eeeae5d1a299ebbe90b4dd8ce872393c4eeb0f1cbb3ee2506d53f094662c474decef18cffd8bf96d501e744606d35d732298810aeae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmverb.sty \
texlive-gmverb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eufrak.sty \
tex-gmcommand.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
