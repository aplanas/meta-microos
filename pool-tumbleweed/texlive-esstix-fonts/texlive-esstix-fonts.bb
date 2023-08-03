SUMMARY = "Severed fonts for texlive-esstix"
DESCRIPTION = "The  separated fonts package for texlive-esstix"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn22426"

RPM_NAME = "texlive-esstix-fonts-2023.209.1.0svn22426-53.1.noarch.rpm"
RPM_HASH = "1146a148cbe40761bfc2ca266f2b162bfad2db4dc31b0df9de919400d8cd5eef27c40a5b46ef73b3aa99ca434f782e31a32277824c77ae996c75877e23283b8a"
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
font-esstix-eight \
font-esstix-eleven \
font-esstix-fifteen \
font-esstix-five \
font-esstix-four \
font-esstix-fourteen \
font-esstix-nine \
font-esstix-one \
font-esstix-seven \
font-esstix-seventeen \
font-esstix-six \
font-esstix-sixteen \
font-esstix-ten \
font-esstix-thirteen \
font-esstix-three \
font-esstix-twelve \
font-esstix-two \
texlive-esstix-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
