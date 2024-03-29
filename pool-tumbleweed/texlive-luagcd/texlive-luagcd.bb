SUMMARY = "Computation of gcd of integers inside LaTeX using Lua"
DESCRIPTION = "Using Lua, the luagcd package is developped to find the \
greatest common divisor (gcd) of integers in LaTeX. The package \
provides commands to obtain step-by-step computation of gcd of \
two integers by using the Euclidean algorithm. In addition, the \
package has the command to express gcd of two integers as a \
linear combination. The Bezout's Identity can be verified for \
any two integers using commands in the package. No particular \
environment is required for the use of commands in the package. \
It is written in Lua, and the TeX file has to be compiled with \
the LuaLaTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn65396"

RPM_NAME = "texlive-luagcd-2023.208.1.0svn65396-53.1.noarch.rpm"
RPM_HASH = "0543e6d26d7aae31a32d699c09f82912794dcb3fe1298264682f57e424c8890a428d49ef2709055ae1170079347910fb5cf450330ca2ce21da5f82d8ebef8add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luagcd.sty \
texlive-luagcd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
