SUMMARY = "Severed fonts for texlive-hfbright"
DESCRIPTION = "The  separated fonts package for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-hfbright-fonts-2023.209.svn29349-54.2.noarch.rpm"
RPM_HASH = "c74a40459bc273ba7c69219d452b22ffba38f4b642450c75bc20760f50a03226983648c77f80a31b6ea4a83448d2354d35ee1fdb1600481763210c51eeaddd26"
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
