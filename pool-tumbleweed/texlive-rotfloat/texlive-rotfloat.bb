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

PV = "2023.201.1.2svn18292"

RPM_NAME = "texlive-rotfloat-2023.201.1.2svn18292-53.1.noarch.rpm"
RPM_HASH = "1ad33fe84b30042601fb954722af897e794e8da4e799602129b19f172f8617509801acf76f58e118c3c9b7ae0a2db0140003a96f4740736e0ca2d42f6c34cce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rotfloat.sty) \
texlive-rotfloat"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(float.sty) \
tex(rotating.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
