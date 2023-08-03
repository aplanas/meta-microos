SUMMARY = "Symbols collection for typesetting Sequential Function Chart (SFC) diagrams (PLC programs)"
DESCRIPTION = "This package contains a collection of symbols for typesetting \
Sequential Function Chart (SFC) diagrams in agreement with the \
international standard IEC-61131-3/2013. It includes steps \
(normal and initial), transitions, actions and actions \
qualifiers (with and without time duration). It extends the \
circuit library of TikZ and allows you to draw an SFC diagram \
in same way you would draw any other circuit."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn49424"

RPM_NAME = "texlive-tikz-sfc-2023.209.1.0.1svn49424-53.1.noarch.rpm"
RPM_HASH = "28fe7257aa0a9c21b2919d40dce4cfdef67b1a0d8ac8afe8249a3ff6ceeb52dec7bf29ff51b2e3cbf82de7e5c94fc6b1712814d054237295ac4ad55add29679d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarycircuits.plc.sfc.code.tex \
texlive-tikz-sfc"

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
