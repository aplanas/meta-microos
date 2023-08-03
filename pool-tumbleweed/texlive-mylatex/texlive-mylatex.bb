SUMMARY = "Make a format containing a document's preamble"
DESCRIPTION = "The file mylatex.ltx permits you to create a format that \
pre-loads a set of package files (and/or other macros) that you \
regularly use. In some circumstances, this can be a great \
advantage (though on an ordinarily fast modern computer on the \
desktop, gains will be limited). The general scheme is to \
initialise your usage by a command of the form: latex -ini \
mylatex.ltx <document> whick will create a format file \
mylatex.fmt, which you then use as: latex -fmt=mylatex \
<document>"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn56751"

RPM_NAME = "texlive-mylatex-2023.209.svn56751-55.1.noarch.rpm"
RPM_HASH = "261bf280ff2a5ae69f1af56334fb24571ab07088a5d5a2da2dcba7b36bf35d8e225b6a384954291dc86810307b4c88068e1bcdbd16d62d3b7e3bf559ff032f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatex"

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
