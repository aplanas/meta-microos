SUMMARY = "A variant of LaTeX \\verb, verbatim and shortvrb"
DESCRIPTION = "A redefinition of \\verb and verbatim so that long lines are \
breakable before \\ and after { with % as 'hyphen'. Allows you \
to define your own verbatim-like environments (subject to a \
size limit) and allows you to declare any single character as a \
shorthand as in the \\MakeShortVerb command of the shortvrb \
package of the LaTeX distribution. The package depends on the \
gmutils package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98svn24288"

RPM_NAME = "texlive-gmverb-2023.201.0.0.98svn24288-53.2.noarch.rpm"
RPM_HASH = "aa5ad5e2a336c2599216053db3c5bdfe396994db60851d47a4302324a568c10964e8cce1d3c82711351c6cbd4650312dd2190167e405bc29a5e0c50bb937a990"
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
