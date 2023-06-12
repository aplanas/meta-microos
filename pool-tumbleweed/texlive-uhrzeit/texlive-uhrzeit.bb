SUMMARY = "Time printing, in German"
DESCRIPTION = "The primary goal of this package is to facilitate formats and \
ranges of times as formerly used in Germany. A variety of \
printing formats are available."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn39570"

RPM_NAME = "texlive-uhrzeit-2023.201.0.0.2csvn39570-53.1.noarch.rpm"
RPM_HASH = "fb4eaff9c8c04f92e7ffab62b8e7501dfc089a424f610c03aca88092aaa5b54e26eed54afa6530ebc18ef8884cdca674a8b5c7e749cf3734947b3c36b9510810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uhrzeit.sty) \
texlive-uhrzeit"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(soul.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
