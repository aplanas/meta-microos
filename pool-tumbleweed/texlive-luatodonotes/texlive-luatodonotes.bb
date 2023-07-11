SUMMARY = "Add editing annotations in a LuaLaTeX document"
DESCRIPTION = "The package allows the user to insert comments into a document \
that suggest (for example) further editing that may be needed. \
The comments are shown in the margins alongside the text; \
different styles for the comments may be used; the styles are \
selected using package options. The package is based on the \
package todonotes, and depends heavily on Lua, so it can only \
be used with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.5svn53825"

RPM_NAME = "texlive-luatodonotes-2023.208.0.0.5svn53825-53.1.noarch.rpm"
RPM_HASH = "38e7cb88c571b7b165769028bb1a2b4f995954b4ff13817e7264dcb9c519f024def805ba3560e1dfc85c31c09624a17a5b5fb09c25e62cb1a88c5472d764447e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatodonotes.sty \
texlive-luatodonotes"

RDEPENDS:${PN} += "/usr/bin/sh \
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
