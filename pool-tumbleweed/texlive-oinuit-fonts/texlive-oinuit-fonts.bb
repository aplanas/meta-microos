SUMMARY = "Severed fonts for texlive-oinuit"
DESCRIPTION = "The  separated fonts package for texlive-oinuit"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28668"

RPM_NAME = "texlive-oinuit-fonts-2023.201.svn28668-54.1.noarch.rpm"
RPM_HASH = "76f2b7320c84f41ddb44d914ccea8eed6bb172cfdb6a9ae822faed40dc77e8ceeb842f529ba9f91e771290503e32ed96ef83b489c402358b4aabb02ac4fc3127"
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
font(computer) \
font(inuit) \
texlive-oinuit-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
