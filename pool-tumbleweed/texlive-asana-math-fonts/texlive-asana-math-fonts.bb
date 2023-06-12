SUMMARY = "Severed fonts for texlive-asana-math"
DESCRIPTION = "The  separated fonts package for texlive-asana-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.000.958svn59629"

RPM_NAME = "texlive-asana-math-fonts-2023.201.0.000.958svn59629-53.1.noarch.rpm"
RPM_HASH = "d5cbcc6c736fcedc4d5ed7a008ffeaab23794439f22f77e4f5076b0c47192d1d65ee58c5cfd7365f94d710ea1111dc5a84677c919b47bb71930beaea64a9c7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=ch) \
font(:lang=chr) \
font(:lang=da) \
font(:lang=de) \
font(:lang=el) \
font(:lang=en) \
font(:lang=es) \
font(:lang=eu) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gv) \
font(:lang=ho) \
font(:lang=ht) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=kj) \
font(:lang=kwm) \
font(:lang=lb) \
font(:lang=li) \
font(:lang=mg) \
font(:lang=ms) \
font(:lang=nb) \
font(:lang=nds) \
font(:lang=ng) \
font(:lang=nl) \
font(:lang=nn) \
font(:lang=no) \
font(:lang=nr) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sg) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=su) \
font(:lang=sv) \
font(:lang=sw) \
font(:lang=tl) \
font(:lang=ts) \
font(:lang=und-zmth) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=wa) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(asanamath) \
texlive-asana-math-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
