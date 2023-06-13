SUMMARY = "ArabTeX for LuaLaTeX"
DESCRIPTION = "This package provides for LuaLaTeX an ArabTeX-like interface to \
generate Arabic writing from an ascii transliteration. It is \
particularly well-suited for complex documents such as \
technical documents or critical editions where a lot of \
left-to-right commands intertwine with Arabic writing. \
arabluatex is able to process any ArabTeX input notation. Its \
output can be set in the same modes of vocalization as ArabTeX, \
or in different roman transliterations. It further allows many \
typographical refinements. It will eventually interact with \
some other packages yet to come to produce from .tex source \
files, in addition to printed books, TEI xml compliant critical \
editions and/or lexicons that can be searched, analyzed and \
correlated in various ways."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.20svn54512"

RPM_NAME = "texlive-arabluatex-2023.201.1.20svn54512-54.1.noarch.rpm"
RPM_HASH = "d42ad1c83dcf52b4986a7f46aec5fd62ea66c41af85be008d9f64064483a5841cd00a83e8a7a3985a2ff04eca07b03debfe0210f4d0c620b64d0e9bfec639626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arabluatex-patch.sty) \
tex(arabluatex.sty) \
texlive-arabluatex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(adjustbox.sty) \
tex(etoolbox.sty) \
tex(fontspec.sty) \
tex(iftex.sty) \
tex(lua-ul.sty) \
tex(luacode.sty) \
tex(luacolor.sty) \
tex(scrextend.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
