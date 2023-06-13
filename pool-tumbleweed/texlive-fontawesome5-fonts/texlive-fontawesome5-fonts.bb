SUMMARY = "Severed fonts for texlive-fontawesome5"
DESCRIPTION = "The  separated fonts package for texlive-fontawesome5"
LICENSE = "OFL-1.1"

PV = "2023.201.5.15.4svn63207"

RPM_NAME = "texlive-fontawesome5-fonts-2023.201.5.15.4svn63207-52.1.noarch.rpm"
RPM_HASH = "e4d7f4b33b52bdd107166210fb509ef246e58ced61b5dc651605419b7faa791cf957575f4ebbab02f81ae53135a2887839446b85517a50390280bff258f4d22c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-fontawesome5-fonts) \
font(:lang=fj) \
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
font(fontawesome5brands) \
font(fontawesome5brandsregular) \
font(fontawesome5free) \
font(fontawesome5freeregular) \
font(fontawesome5freesolid) \
texlive-fontawesome5-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
