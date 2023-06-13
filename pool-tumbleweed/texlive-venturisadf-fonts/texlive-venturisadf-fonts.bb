SUMMARY = "Severed fonts for texlive-venturisadf"
DESCRIPTION = "The  separated fonts package for texlive-venturisadf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.005svn19444"

RPM_NAME = "texlive-venturisadf-fonts-2023.201.1.005svn19444-53.1.noarch.rpm"
RPM_HASH = "7db6f9009abdec10738b83e438d0e77bcc1ce5bbc3836ebd53d15c0fd97048dbd6b0b8dcba9a255f4214f4c469b02e0b7e2a2afd168347a88239f6ec7832d708"
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
font(venturisadf) \
font(venturisadfcd) \
font(venturisadfcdstyle) \
font(venturisadfgothtitling) \
font(venturisadfheavy) \
font(venturisadfno2) \
font(venturisadfno2cd) \
font(venturisadfno2med) \
font(venturisadfstyle) \
font(venturisadftitlingno1) \
font(venturisadftitlingno2) \
font(venturisadftitlingno3) \
font(venturisadftitlingno4) \
font(venturisoldadf) \
font(venturissansadf) \
font(venturissansadfcd) \
font(venturissansadfex) \
font(venturissansadfheavy) \
font(venturissansadflt) \
font(venturissansadfno2) \
font(venturissansadfno2cd) \
font(venturissansadfno2ex) \
texlive-venturisadf-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
