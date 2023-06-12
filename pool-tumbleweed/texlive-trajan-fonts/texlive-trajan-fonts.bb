SUMMARY = "Severed fonts for texlive-trajan"
DESCRIPTION = "The  separated fonts package for texlive-trajan"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-trajan-fonts-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "8ef315610a286559cd98a9dfceec5412b392cdbf19b31971d23a0eab74191fb1f75dc591a31c1e4872aca572dd9f0e9c3f44e6014373c90aab9c35daf6ea62a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=cs) \
font(:lang=csb) \
font(:lang=da) \
font(:lang=de) \
font(:lang=en) \
font(:lang=es) \
font(:lang=et) \
font(:lang=eu) \
font(:lang=fi) \
font(:lang=fil) \
font(:lang=fj) \
font(:lang=fo) \
font(:lang=fr) \
font(:lang=fur) \
font(:lang=fy) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gv) \
font(:lang=ho) \
font(:lang=hsb) \
font(:lang=ht) \
font(:lang=hu) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=kj) \
font(:lang=ku-tr) \
font(:lang=kwm) \
font(:lang=lb) \
font(:lang=lg) \
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
font(:lang=nso) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sg) \
font(:lang=sk) \
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
font(:lang=tk) \
font(:lang=tl) \
font(:lang=tn) \
font(:lang=tr) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=wo) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(trajan) \
texlive-trajan-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
