SUMMARY = "Underlining for LuaLaTeX"
DESCRIPTION = "This package provides underlining, strikethough, and \
highlighting using features in LuaLaTeX which avoid the \
restrictions imposed by other methods. In particular, kerning \
is not affected, the underlined text can use arbitrary \
commands, hyphenation works etc. The package requires LuaTeX \
version [?] 1.12.0."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2.0svn63469"

RPM_NAME = "texlive-lua-ul-2023.208.0.0.2.0svn63469-53.1.noarch.rpm"
RPM_HASH = "a339efd632ad7e895f58f545210920f0fb13e52da2dac62cb2c02c02ead110e57938a2623405b129059ee0ebc94dd8fddb8aee3d115c055fc49241b833b35478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docstrip-luacode.sty \
tex-lua-ul.sty \
texlive-lua-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luacolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
