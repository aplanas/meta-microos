SUMMARY = "Powerdot, using the style of FU Berlin"
DESCRIPTION = "The bundle provides a powerdot-derived class and a package for \
use with powerdot to provide the corporate design of the Free \
University in Berlin. Users may use the class itself \
(FUpowerdot) or use the package in the usual way with \
\\style=BerlinFU as a class option. Examples of using both the \
class and the package are provided; the PDF is visually \
identical, so the catalogue only lists one; the sources of the \
examples do of course differ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02asvn52922"

RPM_NAME = "texlive-powerdot-fuberlin-2023.209.0.0.02asvn52922-53.1.noarch.rpm"
RPM_HASH = "bc8597aead2a8a132a29d804941ae0f3e85ab4903ef8747f7c3610b24f2352b81fcb0d5843a9f0437acfcf5fcddf189d50df267b6534945c24f7e3cad6c3b673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FUpowerdot.cls \
tex-powerdot-BerlinFU.sty \
texlive-powerdot-fuberlin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-breakurl.sty \
tex-calc.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-pifont.sty \
tex-powerdot.cls \
tex-ragged2e.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
