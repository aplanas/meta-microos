SUMMARY = "Unify maths subscript height"
DESCRIPTION = "This package is based on code (posted long ago to comp.text.tex \
by Donald Arseneau) to equalise the height of subscripts in \
maths. The default behaviour is to place subscripts slightly \
lower when there is a superscript as well, but this can look \
odd in some situations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-subdepth-2023.209.0.0.1svn15878-58.1.noarch.rpm"
RPM_HASH = "67cfbe172df04e0002e5a2fa72f722358a4a0cb362d21e5d20f152b9d677e87f99648e028dda743bf79e9cea57a4535b15cb77e20e1a3f1f85547aa3d28ab6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subdepth.sty \
texlive-subdepth"

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
