SUMMARY = "Drawing TQFT diagrams with TikZ/PGF"
DESCRIPTION = "The package defines some node shapes useful for drawing TQFT \
diagrams with TikZ/PGF. That is, it defines highly customisable \
shapes that look like cobordisms between circles, such as those \
used in TQFT and other mathematical diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn44455"

RPM_NAME = "texlive-tqft-2023.209.2.1svn44455-53.1.noarch.rpm"
RPM_HASH = "f049bde3a9697fe21698adee57d22ba3ffcbf7be856948fb8658ae6067c62c52ac162a894ef82f3265a57e008ad0989c298859b43dd7032473a0a3510e91f7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarytqft.code.tex \
tex-tqft.sty \
texlive-tqft"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
