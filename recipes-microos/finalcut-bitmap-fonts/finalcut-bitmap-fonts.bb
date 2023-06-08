SUMMARY = "X11 bitmap font for FINAL CUT"
DESCRIPTION = "Special X11 bitmap font used by FINAL CUT to display graphic objects."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "finalcut-bitmap-fonts-0.8.0-1.8.noarch.rpm"
RPM_HASH = "c8eeb07608c7e4966b6287c766f23b3e16864eab60c58ae4fd9c413f210e40232c222635bcab861d4101b33c5cee78ce81aaab73a55f4c8170f5f0667bea36a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "finalcut-bitmap-fonts font(:lang=aa) font(:lang=af) font(:lang=an) font(:lang=av) font(:lang=ay) font(:lang=be) font(:lang=bg) font(:lang=bi) font(:lang=br) font(:lang=bs) font(:lang=ca) font(:lang=ce) font(:lang=ch) font(:lang=co) font(:lang=crh) font(:lang=cs) font(:lang=csb) font(:lang=cy) font(:lang=da) font(:lang=de) font(:lang=el) font(:lang=en) font(:lang=eo) font(:lang=es) font(:lang=et) font(:lang=eu) font(:lang=fi) font(:lang=fil) font(:lang=fj) font(:lang=fo) font(:lang=fr) font(:lang=fur) font(:lang=fy) font(:lang=gd) font(:lang=gl) font(:lang=gv) font(:lang=ho) font(:lang=hr) font(:lang=hsb) font(:lang=ht) font(:lang=hu) font(:lang=ia) font(:lang=id) font(:lang=ie) font(:lang=ik) font(:lang=io) font(:lang=is) font(:lang=it) font(:lang=jv) font(:lang=ki) font(:lang=kj) font(:lang=kl) font(:lang=ku-tr) font(:lang=kum) font(:lang=kwm) font(:lang=la) font(:lang=lb) font(:lang=lez) font(:lang=lg) font(:lang=li) font(:lang=lt) font(:lang=lv) font(:lang=mg) font(:lang=mh) font(:lang=mk) font(:lang=ms) font(:lang=mt) font(:lang=na) font(:lang=nb) font(:lang=nds) font(:lang=ng) font(:lang=nl) font(:lang=nn) font(:lang=no) font(:lang=nr) font(:lang=nso) font(:lang=ny) font(:lang=oc) font(:lang=om) font(:lang=os) font(:lang=pap-an) font(:lang=pap-aw) font(:lang=pl) font(:lang=pt) font(:lang=rm) font(:lang=rn) font(:lang=ru) font(:lang=rw) font(:lang=sc) font(:lang=se) font(:lang=sel) font(:lang=sg) font(:lang=sk) font(:lang=sl) font(:lang=sma) font(:lang=smj) font(:lang=smn) font(:lang=sn) font(:lang=so) font(:lang=sq) font(:lang=sr) font(:lang=ss) font(:lang=st) font(:lang=su) font(:lang=sv) font(:lang=sw) font(:lang=tk) font(:lang=tl) font(:lang=tn) font(:lang=tr) font(:lang=ts) font(:lang=uk) font(:lang=uz) font(:lang=vo) font(:lang=vot) font(:lang=wa) font(:lang=wen) font(:lang=wo) font(:lang=xh) font(:lang=yap) font(:lang=za) font(:lang=zu) font(misc8x16graph)"
RDEPENDS:${PN} += "/bin/sh fontconfig"

inherit rpm
