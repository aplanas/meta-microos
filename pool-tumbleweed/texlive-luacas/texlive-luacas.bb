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

PV = "2023.201.1.0.1svn65042"

RPM_NAME = "texlive-luacas-2023.201.1.0.1svn65042-52.1.noarch.rpm"
RPM_HASH = "aca81cdcc5b8c00c589cba306b98fc0d6b7119a6a72f3ce409d0883fec783634983a7bf999f461af711f6b02391ab84c86879a2b035d86e0690b176f58e82045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luacas.sty \
texlive-luacas"

RDEPENDS:${PN} += "/bin/sh \
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
