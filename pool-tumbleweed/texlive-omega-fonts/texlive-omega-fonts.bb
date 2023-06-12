SUMMARY = "Severed fonts for texlive-omega"
DESCRIPTION = "The  separated fonts package for texlive-omega"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn33046"

RPM_NAME = "texlive-omega-fonts-2023.201.svn33046-54.1.noarch.rpm"
RPM_HASH = "c5a0173b711d92312a3eeaa81302e5d2c2b55442dd82d2c1d4eac5cc90a58ad4b7f0bb2c7ab0a6a822f10aae889da7d0b58b3650b42987a123bbd200c2b282da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kwm) \
font(:lang=lg) \
font(:lang=ms) \
font(:lang=ng) \
font(:lang=nr) \
font(:lang=om) \
font(:lang=rn) \
font(:lang=rw) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=sw) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=xh) \
font(:lang=za) \
font(:lang=zu) \
font(omegadingbats) \
font(omegasanstifinagh) \
font(omegaserifarabicone) \
font(omegaserifarabicthree) \
font(omegaserifarabictwo) \
font(omegaserifarmenian) \
font(omegaserifcommon) \
font(omegaserifcyrillic) \
font(omegaserifcyrillicextended) \
font(omegaserifgreek) \
font(omegaserifhebrew) \
font(omegaserifipa) \
font(omegaseriflatin) \
font(omegaseriftifinagh) \
texlive-omega-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
