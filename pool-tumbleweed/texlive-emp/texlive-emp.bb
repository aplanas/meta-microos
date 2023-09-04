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

PV = "2023.209.svn23483"

RPM_NAME = "texlive-emp-2023.209.svn23483-54.2.noarch.rpm"
RPM_HASH = "052d4b05ec091ce30e7d710cd1bb0e2de030c1d58fb9b2d8b64127883be169f48f288cda7daee142c868bd7425f9cba84a8d095f66aef27bf22dd86738d84ea1"
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
