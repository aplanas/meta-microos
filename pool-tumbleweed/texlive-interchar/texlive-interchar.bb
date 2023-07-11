SUMMARY = "Managing character class schemes in XeTeX"
DESCRIPTION = "The package manages character class schemes of XeTeX. Using \
this package, you may switch among different character class \
schemes. Migration commands are provided for make packages \
using this mechanism compatible with each others."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn36312"

RPM_NAME = "texlive-interchar-2023.208.0.0.2svn36312-53.1.noarch.rpm"
RPM_HASH = "4d37536fbe6ffcce9f9ae80f5d119841b0530afc6102ad5ce80d9cd009c1c51336e90c968c1537221f60ad69237ea270f114e30aae2498d9bc968cae9d5f59ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interchar.sty \
texlive-interchar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
