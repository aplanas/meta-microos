SUMMARY = "Underlining for LuaLaTeX"
DESCRIPTION = "This package provides underlining, strikethough, and \
highlighting using features in LuaLaTeX which avoid the \
restrictions imposed by other methods. In particular, kerning \
is not affected, the underlined text can use arbitrary \
commands, hyphenation works etc. The package requires LuaTeX \
version [?] 1.12.0."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn63469"

RPM_NAME = "texlive-lua-ul-2023.201.0.0.2.0svn63469-52.1.noarch.rpm"
RPM_HASH = "389160b9c7001fa21e1a38c6a45159ad99f7559377b0827f7d1f0cc7276d50e5b21d206e8ae2a3cc4cf8593e1e45dcca0348a912bb4381d8c9db2f91080440f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(docstrip-luacode.sty) \
tex(lua-ul.sty) \
texlive-lua-ul"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(luacolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
