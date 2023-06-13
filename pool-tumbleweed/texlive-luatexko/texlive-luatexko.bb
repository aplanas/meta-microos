SUMMARY = "Typeset Korean with Lua(La)TeX"
DESCRIPTION = "This is a Lua(La)TeX macro package that supports typesetting \
Korean documents including Old Hangul texts. As LuaTeX has \
opened up access to almost all the hidden routines of TeX \
engine, users can obtain more beautiful outcome using this \
package rather than other Hangul macros operating on other \
engines. LuaTeX version 1.10+ and luaotfload version 2.96+ are \
required for this package to run. This package also requires \
the cjk-ko package for its full functionality."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.5svn64893"

RPM_NAME = "texlive-luatexko-2023.201.3.5svn64893-52.1.noarch.rpm"
RPM_HASH = "96be49d914103f42fc5a78a5cfbdd53438af4999a3dd08dd875e7b2547d5d4e47005937b4e12f73672edba6b4539881cd22c2a8451a5ba051a03f2ee32badd60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luatexko.sty) \
texlive-luatexko"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(fontspec.sty) \
tex(kolabels-utf.sty) \
tex(konames-utf.sty) \
tex(luaotfload.sty) \
tex(luatexbase.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
