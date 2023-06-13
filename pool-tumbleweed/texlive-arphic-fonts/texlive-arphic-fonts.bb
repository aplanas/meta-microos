SUMMARY = "Severed fonts for texlive-arphic"
DESCRIPTION = "The  separated fonts package for texlive-arphic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-arphic-fonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "6041d55d843f3dc7ecee5e3c41b6d13c241278ef3c19604dac404fabc6f430d713573d263fa86cc110f7cf90a9ca53f0a5c3e5fdb1157463d1c077eefe52dd2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=bg) \
font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kum) \
font(:lang=kwm) \
font(:lang=ms) \
font(:lang=ng) \
font(:lang=nr) \
font(:lang=om) \
font(:lang=os) \
font(:lang=rn) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sel) \
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
font(arplkaitimbig5) \
font(arplkaitimgb) \
font(arplmingti2lbig5) \
font(arplsungtilgb) \
texlive-arphic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
