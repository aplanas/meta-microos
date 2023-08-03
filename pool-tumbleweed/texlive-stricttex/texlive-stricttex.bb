SUMMARY = "Strictly balanced brackets and numbers in command names"
DESCRIPTION = "This is a small, LuaLaTeX-only package providing you with \
three, sometimes useful features: It allows you to make \
brackets [...] 'strict', meaning that each [ must be balanced \
by a ]. It allows you to use numbers in command names, so that \
you can do stuff like \\newcommand\\pi12{\\pi_{12}}. It allows you \
to use numbers and primes in command names, so that you can do \
stuff like \\newcommand\\pi'12{\\pi '_{12}}."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2betasvn56320"

RPM_NAME = "texlive-stricttex-2023.209.0.0.2betasvn56320-58.1.noarch.rpm"
RPM_HASH = "c61037f1b4f2efdd16a4af3a5ed23e9648491005e9474813758377e0249db674f3aafeea51216023b3b6f3c37cf556dbf4204eb4f2f80c3007a32e8722ca14d3"
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
