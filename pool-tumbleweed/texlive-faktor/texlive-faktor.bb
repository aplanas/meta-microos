SUMMARY = "Typeset quotient structures with LaTeX"
DESCRIPTION = "The package provides the means to typeset factor structures, as \
are used in many areas of algebraic notation. The structure is \
similar to the 'A/B' that is provided by the nicefrac package \
(part of the units distribution), and by the xfrac package; the \
most obvious difference is that the numerator and denominator's \
sizes do not change in the \\faktor command."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn15878"

RPM_NAME = "texlive-faktor-2023.201.0.0.1bsvn15878-52.1.noarch.rpm"
RPM_HASH = "b41f16d3dc77309d3c95ffc1743535304d7f861e272c1b8a139ff2849a19dca5fc3bd41d6d6d413b025c2a5929d9fb68f695b5a5bf80a96d3697f729ec875c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(faktor.sty) \
texlive-faktor"
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
