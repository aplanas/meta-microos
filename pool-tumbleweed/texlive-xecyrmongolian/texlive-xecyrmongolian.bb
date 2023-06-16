SUMMARY = "Basic support for the typesetting of Cyrillic Mongolian documents using (Xe|Lua)LaTeX"
DESCRIPTION = "The 'xecyrmongolian' package can be used to produce documents \
in Cyrillic Mongolian using either XeLaTeX or LuaLaTeX. The \
command \\setlanguage can be used to load alternative \
hyphenation patterns so to be able to create multilingual \
documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-2023.201.1.0svn53160-52.1.noarch.rpm"
RPM_HASH = "db8fdda5159a52b0392b568b2d8165237aa843bf39c8d1b59b941275291c108696ede3f92824a17f2d9147aa6b02900aecbd302df378a20deded93db915b7d08"
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
