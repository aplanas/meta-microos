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

PV = "2023.201.svn56751"

RPM_NAME = "texlive-mylatex-2023.201.svn56751-54.1.noarch.rpm"
RPM_HASH = "3456f180b6e921868375ec5f5ba00e975a92f3b981890b90833f720e96ac73e17dd0e9659ca02cc448dd98af76b61bd16f525b18861e7aeb02914c38d0a0d1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatex"

RDEPENDS:${PN} += "/bin/sh \
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
