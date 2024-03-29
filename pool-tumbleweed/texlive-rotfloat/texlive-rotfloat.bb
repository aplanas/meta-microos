SUMMARY = "Rotate floats"
DESCRIPTION = "The float package provides commands to define new floats of \
various styles (plain, boxed, ruled, and userdefined ones); the \
rotating package provides new environments (sidewaysfigure and \
sidewaystable) which are rotated by 90 or 270 degrees. But what \
about new rotated floats, e.g. a rotated ruled one? This \
package makes this possible; it builds a bridge between the two \
packages and extends the commands from the float package to \
define rotated versions of the new floats, too."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18292"

RPM_NAME = "texlive-rotfloat-2023.209.1.2svn18292-54.1.noarch.rpm"
RPM_HASH = "52134250a730b638323d9926cf42063eae3dba4052e4950046098c1a866b54ce77633e13d71a5ad1e96c61e73060ddfadcfec278274678fd6441ebe95ba82740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rotfloat.sty \
texlive-rotfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
