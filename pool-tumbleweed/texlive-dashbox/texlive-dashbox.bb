SUMMARY = "Draw dashed boxes"
DESCRIPTION = "The package can draw boxes that perform like \\framebox or \
\\fbox, but use dashed lines. The package can also draw (an \
illusion of) vertical stacks of boxes."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.14svn23425"

RPM_NAME = "texlive-dashbox-2023.204.1.14svn23425-54.1.noarch.rpm"
RPM_HASH = "7358643c79c97bf22a37a29659c4d7921fee64f611fca1af47db36918222c336d826ba152c79bf588f412d5ad395bea6155e8a2bc763d92068706e55df0c8e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashbox.sty \
texlive-dashbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
