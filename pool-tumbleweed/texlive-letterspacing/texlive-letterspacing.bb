SUMMARY = "Letter spacing"
DESCRIPTION = "Space out the letters of text; the command is \
\\letterspace<\\hbox modifier>{<text>}: the text is placed in an \
\\hbox of the specified size, and space is inserted between each \
glyph to make the text fit the box. Note that letterspacing is \
not ordinarily considered acceptable in modern typesetting of \
English."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn54266"

RPM_NAME = "texlive-letterspacing-2023.209.svn54266-55.1.noarch.rpm"
RPM_HASH = "2c602b14731d432ab20f9fd18586936c81fe71514be629a63a2241ad55c2d61aa3a9128147068eef2705986b024432a3fed13ffdc8c8c100e1b075dbfb688694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letterspacing.tex \
texlive-letterspacing"

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
