SUMMARY = "Proper MLA formatting"
DESCRIPTION = "The package formats articles using the MLA style ('MLA' = \
'Modern Language Association'). The aim is that students and \
other academics in the humanities should be able to typeset \
their materials, properly, with minimal effort on their part."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-mla-paper-2023.201.svn54080-54.1.noarch.rpm"
RPM_HASH = "1ec7c69f0fa1d2038adc7f12c56bb2eefe48111834c96ff26723796a2b505d16815e0aa56364bf4fabe77f2bc2a9726b0518b0a895714208ca0ba8922aa60e8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mla.sty \
texlive-mla-paper"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-thumbpdf.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
