SUMMARY = "Severed fonts for texlive-librefranklin"
DESCRIPTION = "The  separated fonts package for texlive-librefranklin"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64441"

RPM_NAME = "texlive-librefranklin-fonts-2023.201.svn64441-54.1.noarch.rpm"
RPM_HASH = "46b36896543fb66ad3f04911d27cf82ee9686aa3786992a0692cbb2f57f4c60843eb3fedc99d17a8b5af27713171a04bbfd77d79677ccc151be2f0e780b5fea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-librefranklin-fonts) \
font(:lang=aa) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=az-az) \
font(:lang=bi) \
font(:lang=bin) \
font(:lang=br) \
font(:lang=bs) \
font(:lang=ca) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=crh) \
font(:lang=cs) \
font(:lang=csb) \
font(:lang=cy) \
font(:lang=da) \
font(:lang=de) \
font(:lang=en) \
font(:lang=eo) \
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
font(:lang=gn) \
font(:lang=gv) \
font(:lang=ho) \
font(:lang=hr) \
font(:lang=hsb) \
font(:lang=ht) \
font(:lang=hu) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=ig) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=ki) \
font(:lang=kj) \
font(:lang=kl) \
font(:lang=ku-tr) \
font(:lang=kwm) \
font(:lang=la) \
font(:lang=lb) \
font(:lang=lg) \
font(:lang=li) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
font(:lang=ms) \
font(:lang=mt) \
font(:lang=na) \
font(:lang=nb) \
font(:lang=nds) \
font(:lang=ng) \
font(:lang=nl) \
font(:lang=nn) \
font(:lang=no) \
font(:lang=nr) \
font(:lang=nso) \
font(:lang=nv) \
font(:lang=ny) \
font(:lang=oc) \
font(:lang=om) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ro) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=se) \
font(:lang=sg) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=smn) \
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
font(:lang=ty) \
font(:lang=uz) \
font(:lang=vi) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=wo) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(librefranklin) \
font(librefranklin-black) \
font(librefranklin-blackitalic) \
font(librefranklin-bold) \
font(librefranklin-bolditalic) \
font(librefranklin-extrabold) \
font(librefranklin-extrabolditalic) \
font(librefranklin-extralight) \
font(librefranklin-extralightitalic) \
font(librefranklin-italic) \
font(librefranklin-light) \
font(librefranklin-lightitalic) \
font(librefranklin-medium) \
font(librefranklin-mediumitalic) \
font(librefranklin-regular) \
font(librefranklin-semibold) \
font(librefranklin-semibolditalic) \
font(librefranklin-thin) \
font(librefranklin-thinitalic) \
font(librefranklinblack) \
font(librefranklinextrabold) \
font(librefranklinextralight) \
font(librefranklinlight) \
font(librefranklinmedium) \
font(librefranklinsemibold) \
font(librefranklinthin) \
texlive-librefranklin-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
