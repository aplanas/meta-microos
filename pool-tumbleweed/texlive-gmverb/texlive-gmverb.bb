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

RPM_NAME = "texlive-gmverb-2023.201.0.0.98svn24288-53.1.noarch.rpm"
RPM_HASH = "b0138fa2060351efb206d5f421cf7bc48a9c887f5842ad2ef8f45ae1e58509787389e6651787a1f7ab1c90d39dd844057d661f6936fe673e209a7cbcced9ad01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gmverb.sty) \
texlive-gmverb"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(eufrak.sty) \
tex(gmcommand.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
