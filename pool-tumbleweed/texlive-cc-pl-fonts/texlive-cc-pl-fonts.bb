SUMMARY = "Severed fonts for texlive-cc-pl"
DESCRIPTION = "The  separated fonts package for texlive-cc-pl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.02.3svn58602"

RPM_NAME = "texlive-cc-pl-fonts-2023.201.1.02.3svn58602-52.1.noarch.rpm"
RPM_HASH = "87444aca6fe622eb913fa9b4c90dd650d408e4fe64a5e18706d7ac9ad40881b7126d9fff845770af18b1641028e3f387f45bcdd5cfeb0c59cb14e2919180b3f0"
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

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
