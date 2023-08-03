SUMMARY = "Support for writing modular and customisable code"
DESCRIPTION = "The package provides the means of writing code in a modular \
fashion: big macros or functions are divided into small chunks \
(called gates) with names, which can be externally controlled \
(e.g. they can be disabled, subjected to conditionals, \
loops...) and/or augmented with new chunks. Thus complex code \
may easily be customised without having to rewrite it, or even \
understand its implementation: the behavior of existing gates \
can be modified, and new ones can be added, without endangering \
the whole design. This allows code to be hacked in ways the \
original authors might have never envisioned. The gates package \
is implemented independently for both TeX and Lua. The TeX \
implementation, running in any current environment, requires \
the texapi package, whereas the Lua version can be run with any \
Lua interpreter, not just LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn29803"

RPM_NAME = "texlive-gates-2023.209.0.0.2svn29803-53.1.noarch.rpm"
RPM_HASH = "878d32ea3d3c4710ced2e188c4e41cbdb7facf9ec8cb3eadac487f297de51ee637fcdec481324f2ae52d8748d5f8599d134b08217a74c572f29d2d7562c6bb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gates.sty \
tex-gates.tex \
tex-t-gates.tex \
texlive-gates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
