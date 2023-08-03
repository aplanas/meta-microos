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

RPM_NAME = "texlive-gmverb-2023.209.0.0.98svn24288-54.1.noarch.rpm"
RPM_HASH = "52830ac5ba8f786fab6055b0bd296d6d24d93e9f0e7c86f787a4a65659f111702dde38a732c9623c9d3d4aa98baa6970455f5804bcc15082792fe59d1f332b4d"
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
