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

PV = "2023.209.1.3svn64072"

RPM_NAME = "texlive-tikz-relay-2023.209.1.3svn64072-53.1.noarch.rpm"
RPM_HASH = "88326287cb9de01a3e9dea80726ac865d91f68a351c5dd8131a27c32be0f4ea5fee8c5b35875bc258a65379f7cc8ee43f511c84a21c3be7bfd16baab6187ca24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarycircuits.ee.IEC.relay.code.tex \
texlive-tikz-relay"

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
