SUMMARY = "'Encapsulate' MetaPost figures in a document"
DESCRIPTION = "Emp is a package for encapsulating MetaPost figures in LaTeX: \
the package provides environments where you can place MetaPost \
commands, and means of using that code as fragments for \
building up figures to include in your document. So, with emp, \
the procedure is to run your document with LaTeX, run MetaPost, \
and then complete running your document in the normal way. Emp \
is therefore useful for keeping illustrations in synchrony with \
the text. It also frees you from inventing descriptive names \
for PostScript files that fit into the confines of file system \
conventions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn23483"

RPM_NAME = "texlive-emp-2023.201.svn23483-53.2.noarch.rpm"
RPM_HASH = "f18ca8b2d01de13b788c5547a4112f5d9941cb5405f16ce9fcedb917b355db489289d3eed2af69d38dc1dc79949e9c31b79ef563200a40e5436f3c16c4eb53a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emp.sty \
texlive-emp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
