SUMMARY = "Basic support for the typesetting of Cyrillic Mongolian documents using (Xe|Lua)LaTeX"
DESCRIPTION = "The 'xecyrmongolian' package can be used to produce documents \
in Cyrillic Mongolian using either XeLaTeX or LuaLaTeX. The \
command \\setlanguage can be used to load alternative \
hyphenation patterns so to be able to create multilingual \
documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-2023.201.1.0svn53160-52.2.noarch.rpm"
RPM_HASH = "58b4785760f9928a06d23a46ae511ed8efba9edcebebc3c0e0051e7e161c20c3dafc1d2a18191d58e14ffdadc47087df7ae33f532c92e32c9c21e026b6439345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecyrmongolian.sty \
texlive-xecyrmongolian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luahyphenrules.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
