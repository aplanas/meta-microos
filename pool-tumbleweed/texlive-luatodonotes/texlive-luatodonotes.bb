SUMMARY = "Add editing annotations in a LuaLaTeX document"
DESCRIPTION = "The package allows the user to insert comments into a document \
that suggest (for example) further editing that may be needed. \
The comments are shown in the margins alongside the text; \
different styles for the comments may be used; the styles are \
selected using package options. The package is based on the \
package todonotes, and depends heavily on Lua, so it can only \
be used with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn53825"

RPM_NAME = "texlive-luatodonotes-2023.201.0.0.5svn53825-52.1.noarch.rpm"
RPM_HASH = "2914a8ae47ae2d4af8078f6192dfa27d40f45153fca96367307654bce976046515704b9cf03491c5a7206c1dd44a264b6007529a17e8a70915b5c55ce98ade73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatodonotes.sty \
texlive-luatodonotes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-ifoddpage.sty \
tex-ifthen.sty \
tex-luacode.sty \
tex-soul.sty \
tex-soulpos.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
