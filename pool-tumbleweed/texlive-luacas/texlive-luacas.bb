SUMMARY = "A computer algebra system for users of LuaLaTeX"
DESCRIPTION = "This package provides a portable computer algebra system \
capable of symbolic computation, written entirely in Lua, \
designed for use in LuaLaTeX. Features include: \
arbitrary-precision integer and rational arithmetic, factoring \
of univariate polynomials over the rationals and finite fields, \
number theoretic algorithms, symbolic differentiation and \
integration, and more. The target audience for this package are \
mathematics students, instructors, and professionals who would \
like some ability to perform basic symbolic computations within \
LaTeX without the need for laborious and technical setup."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.1svn65042"

RPM_NAME = "texlive-luacas-2023.208.1.0.1svn65042-53.1.noarch.rpm"
RPM_HASH = "77acb2c2afd69194d7bad06340fa9f6ddb454228424866584cee33651950a8f0c368bf1d2d7dbeb6bfe2f77455ade376b98b9b317267c7c6ba1da930b67a14c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacas.sty \
texlive-luacas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luacode.sty \
tex-mathtools.sty \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
