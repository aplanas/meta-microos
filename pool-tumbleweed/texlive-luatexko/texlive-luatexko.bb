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

PV = "2023.208.3.5svn64893"

RPM_NAME = "texlive-luatexko-2023.208.3.5svn64893-53.1.noarch.rpm"
RPM_HASH = "df1f2fd9bd596fc11633c6871fed934b71fd29ffc809ed4beb409f1d825da8a25261ec8a5a3c78cd2792df3e4c8f248ffff822c169988db4789183080edcacf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatexko.sty \
texlive-luatexko"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-fontspec.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
tex-luaotfload.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
