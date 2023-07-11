SUMMARY = "Generate modular addition and multiplication tables"
DESCRIPTION = "This package is developed to generate modular addition and \
multiplication tables for positive integers. It provides an \
easy way to generate modular addition and modular \
multiplication tables for positive integers in LaTeX documents. \
The commands in the package have optional arguments for the \
formatting of tables. These commands can be used in an \
environment similar to a tabular or array environment. The \
commands can also be used with the booktabs package, which \
provides nice formatting of tables in LaTeX. It is written in \
Lua, and TeX file is to be compiled with LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65485"

RPM_NAME = "texlive-luamodulartables-2023.208.1.0svn65485-53.1.noarch.rpm"
RPM_HASH = "ac23477be803209abdfcbe8b68c298c9507e4e9e1684f830da9ba3eebe2680f7bb2223664859d9c5c575bf9f90b04e761c0dfa9c51c1a404db1c79dcab74221c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamodulartables.sty \
texlive-luamodulartables"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
