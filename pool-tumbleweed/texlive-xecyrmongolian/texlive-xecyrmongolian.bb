SUMMARY = "Basic support for the typesetting of Cyrillic Mongolian documents using (Xe|Lua)LaTeX"
DESCRIPTION = "The 'xecyrmongolian' package can be used to produce documents \
in Cyrillic Mongolian using either XeLaTeX or LuaLaTeX. The \
command \\setlanguage can be used to load alternative \
hyphenation patterns so to be able to create multilingual \
documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-2023.209.1.0svn53160-53.2.noarch.rpm"
RPM_HASH = "7ffd03b8467515a9af8ecd0f23bc2f7111fa2476803a36b1142dcf15bf816c0417dc9897132fb5d978a75c2a40d9c2bc0f61de25ab44fce4b969521fbe5f29a4"
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
