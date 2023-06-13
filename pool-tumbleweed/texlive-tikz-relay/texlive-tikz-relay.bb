SUMMARY = "TikZ library for typesetting electrical diagrams"
DESCRIPTION = "This package contains a collection of symbols for typesetting \
electrical wiring diagrams for relay control systems. The \
symbols are meant to be in agreement with the international \
standard IEC-60617 which has been adopted worldwide, with \
perhaps the exception of the USA. It extends and modifies, when \
needed, the TikZ-libray circuits.ee.IEC. A few non-standard \
symbols are also included mainly to be used in presentations, \
particularly with the beamer package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn64072"

RPM_NAME = "texlive-tikz-relay-2023.201.1.3svn64072-52.1.noarch.rpm"
RPM_HASH = "c01ff347c08df969c4e22d206a5f579770d0b8559db051c0197fd74610ae63277570083717fcfd824457642a9451026fe75a82ab37e4e3d65155d763fd5498cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibrarycircuits.ee.IEC.relay.code.tex) \
texlive-tikz-relay"

RDEPENDS:${PN} += "/bin/sh \
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
