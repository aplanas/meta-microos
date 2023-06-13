SUMMARY = "Adaptable tables"
DESCRIPTION = "The package allows data, text (including (La)TeX commands or \
environments) to be formatted into a array which may be split."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30991"

RPM_NAME = "texlive-nox-2023.201.1.0svn30991-54.1.noarch.rpm"
RPM_HASH = "62d5277584255472d0ec2125861ed8eebdf598daa3729042841a65e9c7f9de018c3f5ba11297ae0e14276f4a2e4dd53396fb4eddb7afdbd5fb23cecd8a44339e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nox.sty) \
texlive-nox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(longtable.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
