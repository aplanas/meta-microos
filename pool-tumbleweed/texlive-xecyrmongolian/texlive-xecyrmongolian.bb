SUMMARY = "Basic support for the typesetting of Cyrillic Mongolian documents using (Xe|Lua)LaTeX"
DESCRIPTION = "The 'xecyrmongolian' package can be used to produce documents \
in Cyrillic Mongolian using either XeLaTeX or LuaLaTeX. The \
command \\setlanguage can be used to load alternative \
hyphenation patterns so to be able to create multilingual \
documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-2023.209.1.0svn53160-53.1.noarch.rpm"
RPM_HASH = "4c96e4516708b76b7bc62a4ea69cb82dc9a0febd145b309e85626e0e6fb6aeccd5148e26154ef39205748376b410aff5a13b8d82654f437993f10d310df6b9a7"
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
