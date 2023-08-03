SUMMARY = "Draw ladder diagrams using TikZ"
DESCRIPTION = "The tikz-ladder package contains a collection of symbols for \
typesetting ladder diagrams (PLC program) in agreement with the \
international standard IEC-61131-3/2013. It includes blocks \
(for representing functions and function blocks) besides \
contacts and coils. It extends the circuit library of TikZ and \
allows you to draw a ladder diagram in the same way as you \
would draw any other circuit."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62992"

RPM_NAME = "texlive-tikz-ladder-2023.209.1.3svn62992-53.1.noarch.rpm"
RPM_HASH = "1c43100d4f0b788f24724b969cdcc2ffcf427b3dd8381ce819e3183f0891b48d4eec7a3bac801320769f0c7c04e67e07b67cccfb043d45eb176cce98c0b52fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarycircuits.plc.ladder.code.tex \
texlive-tikz-ladder"

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
