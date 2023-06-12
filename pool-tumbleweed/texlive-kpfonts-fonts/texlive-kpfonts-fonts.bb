SUMMARY = "Severed fonts for texlive-kpfonts"
DESCRIPTION = "The  separated fonts package for texlive-kpfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.35svn65583"

RPM_NAME = "texlive-kpfonts-fonts-2023.201.3.35svn65583-55.1.noarch.rpm"
RPM_HASH = "ed890f50076b1022d0ff2a5417695486f2c54b80f44c1641eba7df8383bdac07fe10857ff93a3a6c09af31f1272565702800ed576a6591c09f8301eda9a2e7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=ch) \
font(:lang=co) \
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
font(:lang=nso) \
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
font(:lang=tn) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(kp) \
font(kp--m) \
font(kp--m-ex) \
font(kp--m-exa) \
font(kp--m-sy) \
font(kp--m-sya) \
font(kp--m-syb) \
font(kp--m-syc) \
font(kp--m-syd) \
font(kp-companion) \
font(kp-expert) \
font(kp-largesmallcaps) \
font(kp-light) \
font(kp-light-companion) \
font(kp-light-expert) \
font(kp-light-largesmallcaps) \
font(kp-light-m) \
font(kp-light-m-ex) \
font(kp-light-m-exa) \
font(kp-light-m-sy) \
font(kp-light-m-syb) \
font(kp-light-m-syc) \
font(kp-light-m-syd) \
font(kp-light-sc-expert) \
font(kp-light-smallcaps) \
font(kp-sc-expert) \
font(kp-smallcaps) \
font(sf-kp) \
font(sf-kp-comp) \
font(sf-kp-companion) \
font(sf-kp-exp) \
font(sf-kp-largesmallcaps) \
font(sf-kp-sc) \
font(sf-kp-sc-exp) \
font(tt-kp) \
font(tt-kp-comp) \
font(tt-kp-exp) \
texlive-kpfonts-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
