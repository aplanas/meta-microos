SUMMARY = "Severed fonts for texlive-ipaex"
DESCRIPTION = "The  separated fonts package for texlive-ipaex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-ipaex-fonts-2023.201.svn61719-55.1.noarch.rpm"
RPM_HASH = "95ad3ca329f4b79a574313c22383622251a03f4c79f0584c9cf82ef92a179b6af07e06858fdfbfe921112ae507b3d4c53e2391c3384c5fe480bcae726765d21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=ch) \
font(:lang=cs) \
font(:lang=csb) \
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
font(:lang=fur) \
font(:lang=fy) \
font(:lang=gd) \
font(:lang=gl) \
font(:lang=gv) \
font(:lang=haw) \
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
font(:lang=ja) \
font(:lang=jv) \
font(:lang=kj) \
font(:lang=ku-tr) \
font(:lang=kum) \
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
font(:lang=os) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=qu) \
font(:lang=quz) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sk) \
font(:lang=sm) \
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
font(:lang=to) \
font(:lang=ts) \
font(:lang=ty) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(ipaexgothic) \
font(ipaexmincho) \
font(ipaexゴシック) \
font(ipaex明朝) \
font(ipagothic) \
font(ipamincho) \
font(ipapgothic) \
font(ipapmincho) \
font(ipapゴシック) \
font(ipap明朝) \
font(ipaゴシック) \
font(ipa明朝) \
texlive-ipaex-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
