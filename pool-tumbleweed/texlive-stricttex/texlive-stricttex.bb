SUMMARY = "Strictly balanced brackets and numbers in command names"
DESCRIPTION = "This is a small, LuaLaTeX-only package providing you with \
three, sometimes useful features: It allows you to make \
brackets [...] 'strict', meaning that each [ must be balanced \
by a ]. It allows you to use numbers in command names, so that \
you can do stuff like \\newcommand\\pi12{\\pi_{12}}. It allows you \
to use numbers and primes in command names, so that you can do \
stuff like \\newcommand\\pi'12{\\pi '_{12}}."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2betasvn56320"

RPM_NAME = "texlive-stricttex-2023.201.0.0.2betasvn56320-57.1.noarch.rpm"
RPM_HASH = "a103f2ab362dbb163dcbb52d62441577733221b4f14d4bf731ab377916bfacb748b0318afbd3f6f241d8789df0080698b9a9a10b250fa84cff14b1b87efb007b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stricttex.sty \
texlive-stricttex"

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
