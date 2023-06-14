SUMMARY = "Severed fonts for texlive-bbold-type1"
DESCRIPTION = "The  separated fonts package for texlive-bbold-type1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn33143"

RPM_NAME = "texlive-bbold-type1-fonts-2023.201.svn33143-53.1.noarch.rpm"
RPM_HASH = "17957d53cc165f3b26008493c62450f891ba4c2a789d742f8e18e1c923eac25c5c177672b77cc33afa3c6babfb647e48689c8389f40dbeb1aa4a8a24fdd5f289"
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
font-bbold \
texlive-bbold-type1-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
