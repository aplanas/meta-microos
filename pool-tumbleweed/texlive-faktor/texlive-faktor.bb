SUMMARY = "Typeset quotient structures with LaTeX"
DESCRIPTION = "The package provides the means to typeset factor structures, as \
are used in many areas of algebraic notation. The structure is \
similar to the 'A/B' that is provided by the nicefrac package \
(part of the units distribution), and by the xfrac package; the \
most obvious difference is that the numerator and denominator's \
sizes do not change in the \\faktor command."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1bsvn15878"

RPM_NAME = "texlive-faktor-2023.209.0.0.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "1018012d07a7b52ecf60bac0d2c6c68bbc7a0f1f3317578f30fdc047359ca78f1ae730df96c830cf08026315ca83da5b485f3c7070d38b0563abed4a5b5b480c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-faktor.sty \
texlive-faktor"

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
