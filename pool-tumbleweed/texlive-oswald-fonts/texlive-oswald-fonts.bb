SUMMARY = "Severed fonts for texlive-oswald"
DESCRIPTION = "The  separated fonts package for texlive-oswald"
LICENSE = "OFL-1.1"

PV = "2023.201.svn60784"

RPM_NAME = "texlive-oswald-fonts-2023.201.svn60784-54.1.noarch.rpm"
RPM_HASH = "49301ad901734df7daa203dc71468e00802f44b807729bcda5244a4988c81ad4a9829b71f95c353d10610f0af78bc27b25fe64ec60fa0bb245368a5d11cc9fde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(0swald) \
font(0swaldextralight) \
font(0swaldlight) \
font(0swaldmedium) \
font(0swaldsemibold) \
font(:lang=aa) \
font(:lang=af) \
font(:lang=an) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=az-az) \
font(:lang=be) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=bin) \
font(:lang=br) \
font(:lang=bs) \
font(:lang=ca) \
font(:lang=ce) \
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
font(:lang=ga) \
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
font(:lang=ik) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=ki) \
font(:lang=kj) \
font(:lang=kk) \
font(:lang=kl) \
font(:lang=ku-tr) \
font(:lang=kum) \
font(:lang=kw) \
font(:lang=kwm) \
font(:lang=la) \
font(:lang=lb) \
font(:lang=lez) \
font(:lang=lg) \
font(:lang=li) \
font(:lang=lt) \
font(:lang=lv) \
font(:lang=mg) \
font(:lang=mh) \
font(:lang=mk) \
font(:lang=mo) \
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
font(:lang=os) \
font(:lang=pap-an) \
font(:lang=pap-aw) \
font(:lang=pl) \
font(:lang=pt) \
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ro) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=se) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=smn) \
font(:lang=sms) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=sr) \
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
font(:lang=uk) \
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
texlive-oswald-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
