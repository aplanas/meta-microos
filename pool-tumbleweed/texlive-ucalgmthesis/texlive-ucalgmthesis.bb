SUMMARY = "LaTeX thesis class for University of Calgary Faculty of Graduate Studies"
DESCRIPTION = "ucalgmthesis.cls is a LaTeX class file that produces documents \
according to the thesis guidelines of the University of Calgary \
Faculty of Graduate Studies. It uses the memoir class, which \
provides very powerful and flexible mechanisms for book design \
and layout. All memoir commands for changing chapter and \
section headings, page layout, fancy foot- and endnotes, \
typesetting poems, etc., can be used. (Memoir is meant as a \
replacement for the standard LaTeX classes, so all standard \
LaTeX commands such as \\chapter, \\section, etc., still work.) \
Likewise, any of memoir's class options can be passed as \
options to ucalgmthesis, in particular 12pt to select 12 point \
type (11 point is the default)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52527"

RPM_NAME = "texlive-ucalgmthesis-2023.201.svn52527-52.1.noarch.rpm"
RPM_HASH = "60b1dd10304cd3ea30a4409a7b97e9b5b3c07986c1d3f95b4030ac93f82a4ff8dc5d60e420c7bd05a6e1c639f9bce7e709b4320972e92c23ad592224ccb8eb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ucalgmthesis.cls) \
texlive-ucalgmthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsthm.sty) \
tex(fontenc.sty) \
tex(libertine.sty) \
tex(mathdesign.sty) \
tex(memoir.cls) \
tex(newpxmath.sty) \
tex(newpxtext.sty) \
tex(newtxmath.sty) \
tex(newtxtext.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
