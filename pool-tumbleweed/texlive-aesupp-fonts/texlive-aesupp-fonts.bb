SUMMARY = "Severed fonts for texlive-aesupp"
DESCRIPTION = "The  separated fonts package for texlive-aesupp"
LICENSE = "LPPL-1.3c"

PV = "2023.201.1svn58253"

RPM_NAME = "texlive-aesupp-fonts-2023.201.1svn58253-54.1.noarch.rpm"
RPM_HASH = "e69bf04d585bdfca778a60893214c4e18749f021ee28c856be4b04a3f0c3352d6e2481bcd7a9604bf8ccad94f808aa6a4782dee9d711c7dcf6fe0cc0d70410f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-aesupp-fonts) \
font(:lang=aa) \
font(:lang=an) \
font(:lang=ast) \
font(:lang=ay) \
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
font(aebonum) \
font(aemmono10) \
font(aemroman10) \
font(aemroman12) \
font(aemroman7) \
font(aemroman8) \
font(aemroman9) \
font(aepagella) \
font(aeschola) \
texlive-aesupp-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
