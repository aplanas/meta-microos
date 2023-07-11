SUMMARY = "Severed fonts for texlive-hfbright"
DESCRIPTION = "The  separated fonts package for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-hfbright-fonts-2023.201.svn29349-53.2.noarch.rpm"
RPM_HASH = "2a2bb5e84271ee35cc287fcfd4df18f3dead6b026bf6cc2dff2e559e96b93811741bfde80e62655d7732e8efa4ec1bf384cb8a2421ec2aa8108c8b84a8a766a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=fj \
font--lang=ho \
font--lang=ia \
font--lang=io \
font--lang=kj \
font--lang=kwm \
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
font-computermodernbright \
texlive-hfbright-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
