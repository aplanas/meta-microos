SUMMARY = "Severed fonts for texlive-erewhon-math"
DESCRIPTION = "The  separated fonts package for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-fonts-2023.201.0.0.56svn65684-53.1.noarch.rpm"
RPM_HASH = "5d7c3349fa48ba139f2f27d263d72338964521f456c13d29ddba8d25dc9a14697f2c46451e95c71c3ec8d6c1dfd75e19487a1da022ad8c8883be92b3ef12d1b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kwm) \
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
font(erewhon) \
font(erewhonmath) \
texlive-erewhon-math-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
