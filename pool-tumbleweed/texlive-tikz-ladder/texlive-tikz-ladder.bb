SUMMARY = "Draw ladder diagrams using TikZ"
DESCRIPTION = "The tikz-ladder package contains a collection of symbols for \
typesetting ladder diagrams (PLC program) in agreement with the \
international standard IEC-61131-3/2013. It includes blocks \
(for representing functions and function blocks) besides \
contacts and coils. It extends the circuit library of TikZ and \
allows you to draw a ladder diagram in the same way as you \
would draw any other circuit."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62992"

RPM_NAME = "texlive-tikz-ladder-2023.201.1.3svn62992-52.1.noarch.rpm"
RPM_HASH = "92a803a43d9b63f2d61c58ed768f719d5e2c8f4b3642990877dfa5c65da41c051df0d2756c3bd554513592851f44352b0f9bdd3a112ac7cd5f040028dff63bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarycircuits.plc.ladder.code.tex \
texlive-tikz-ladder"

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
