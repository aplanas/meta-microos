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

RPM_NAME = "texlive-hepnames-2023.201.2.0svn35722-53.1.noarch.rpm"
RPM_HASH = "7a40ae088877d6250fdb425b66d028220f128b200b8565b7901a331737370744ee04017e87da50ffadbe6030b4a5e027e85e6068426590b375b3b8c7a1bd3a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hepnames.sty) \
tex(hepnicenames.sty) \
tex(heppennames.sty) \
texlive-hepnames"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(hepparticles.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
