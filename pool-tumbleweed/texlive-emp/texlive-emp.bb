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

RPM_NAME = "texlive-emp-2023.209.svn23483-54.1.noarch.rpm"
RPM_HASH = "8e9579fb8c2505e65937c4da0f539f2334d31eef88bffded7b7e2987052588f9d4bb6d4e4e10797492a7b4ed1e77f03842298e61539016472e88ba5cc128e5c1"
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
