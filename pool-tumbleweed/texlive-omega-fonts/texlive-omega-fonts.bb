SUMMARY = "Severed fonts for texlive-omega"
DESCRIPTION = "The  separated fonts package for texlive-omega"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn33046"

RPM_NAME = "texlive-omega-fonts-2023.209.svn33046-55.1.noarch.rpm"
RPM_HASH = "6290254f26f51735ff4bb14702832b4341469f4cdc969701c1500beaeae1d0c2233784ea2540a30abb1fc906964ee49bdb5dc9ae752f264124f68a56bb778cd0"
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
font-omegadingbats \
font-omegasanstifinagh \
font-omegaserifarabicone \
font-omegaserifarabicthree \
font-omegaserifarabictwo \
font-omegaserifarmenian \
font-omegaserifcommon \
font-omegaserifcyrillic \
font-omegaserifcyrillicextended \
font-omegaserifgreek \
font-omegaserifhebrew \
font-omegaserifipa \
font-omegaseriflatin \
font-omegaseriftifinagh \
texlive-omega-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
