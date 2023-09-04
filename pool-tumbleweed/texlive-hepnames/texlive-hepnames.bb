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

RPM_NAME = "texlive-hepnames-2023.209.2.0svn35722-54.2.noarch.rpm"
RPM_HASH = "787d7e36f44187d852cc6aa023e3c9013065abaebb91056b5c27b5d9a794907c9330c3a894102986ecacaf224ab3e448e6e8bd3aa2253cf68669c9cc15f04eeb"
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
