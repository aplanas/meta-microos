SUMMARY = "Severed fonts for texlive-epiolmec"
DESCRIPTION = "The  separated fonts package for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-epiolmec-fonts-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "39763e4241b23cb08ecb28a1ca8add220c9972e4323b13e1500178282685336a8f5a2ab9fe34a16fd75df7e6eda06f33a7a7f69dc4ccd22bd1c5b377035e669d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
font--lang=lg \
font--lang=ms \
font--lang=ng \
font--lang=nr \
font--lang=om \
font--lang=rn \
font--lang=rw \
font--lang=sn \
font--lang=so \
font--lang=ss \
font--lang=st \
font--lang=sw \
font--lang=ts \
font--lang=uz \
font--lang=xh \
font--lang=za \
font--lang=zu \
font-epi-olmce \
texlive-epiolmec-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
