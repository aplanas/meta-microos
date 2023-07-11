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

PV = "2023.201.2.0svn35722"

RPM_NAME = "texlive-hepnames-2023.201.2.0svn35722-53.2.noarch.rpm"
RPM_HASH = "9696da2f3f8774469e4d0a13b7fda902a474177b46ca141e42bf42a00368dcd1de972043f30407cf28d2f68690d7cdd844a53f1c24a7fa11b8bef86c425a123f"
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
