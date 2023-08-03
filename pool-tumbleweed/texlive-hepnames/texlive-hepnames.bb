SUMMARY = "Pre-defined high energy particle names"
DESCRIPTION = "Hepnames provides a pair of LaTeX packages, heppennames and \
hepnicenames, providing a large set of pre-defined high energy \
physics particle names built with the hepparticles package. The \
packages are based on pennames.sty by Michel Goosens and Eric \
van Herwijnen. Heppennames re-implements the particle names in \
pennames.sty, with some additions and alterations and greater \
flexibility and robustness due to the hepparticles structures, \
which were written for this purpose. Hepnicenames provides the \
main non-resonant particle names from heppennames with more \
'friendly' names."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn35722"

RPM_NAME = "texlive-hepnames-2023.209.2.0svn35722-54.1.noarch.rpm"
RPM_HASH = "8620ce7c3caf0c62b8b90010158e96d42aab2c06b094f439be3bc2564832ebe35cfd12bbb5304d6d1e7e14392cc6e67efa9969a3b5448ea863b2d697c8b63a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hepnames.sty \
tex-hepnicenames.sty \
tex-heppennames.sty \
texlive-hepnames"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-hepparticles.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
