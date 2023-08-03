SUMMARY = "Severed fonts for texlive-cc-pl"
DESCRIPTION = "The  separated fonts package for texlive-cc-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-fonts-2023.209.1.02.3svn58602-53.1.noarch.rpm"
RPM_HASH = "9ac2637926ce31c08beb6c6e7580e85c558cb7025c881edc1e8d802adee84f8336bbaefae10cc8ae1c837febd7e529314b709988e573937d59861cbb1ff22a59"
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
font--lang=pl \
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
font-tex\040pccsc10 \
font-tex\040pcmi10 \
font-tex\040pcr10 \
font-tex\040pcr5 \
font-tex\040pcr6 \
font-tex\040pcr7 \
font-tex\040pcr8 \
font-tex\040pcr9 \
font-tex\040pcsl10 \
font-tex\040pcslc9 \
font-tex\040pcti10 \
texlive-cc-pl-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
