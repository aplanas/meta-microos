SUMMARY = "Severed fonts for texlive-knitting"
DESCRIPTION = "The  separated fonts package for texlive-knitting"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn50782"

RPM_NAME = "texlive-knitting-fonts-2023.201.3.0svn50782-55.1.noarch.rpm"
RPM_HASH = "436928fe063b2dbff1534ca78432d92a90d0a43e83f5a7dc273b5871773e67495838dbe9808f888fbac5db76494c3ad1465cd0bb3e1c240672072d8521faa433"
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
font(knittingsymbols-grid-foreground) \
font(knittingsymbols-grid-grid) \
font(knittingsymbols-grid-incount) \
font(knittingsymbols-grid-outcount) \
font(knittingsymbols-grid-purl) \
font(knittingsymbols-mixed-foreground) \
font(knittingsymbols-mixed-grid) \
font(knittingsymbols-mixed-purl) \
font(knittingsymbols-mixed-raised) \
font(knittingsymbols-nogrid-foreground) \
font(knittingsymbols-nogrid-incount) \
font(knittingsymbols-nogrid-lowered) \
font(knittingsymbols-nogrid-outcount) \
font(knittingsymbols-nogrid-purl) \
font(knittingsymbols-nogrid-raised) \
font(knittingsymbols-wide-foreground) \
font(knittingsymbols-wide-grid) \
font(knittingsymbols-wide-purl) \
texlive-knitting-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
