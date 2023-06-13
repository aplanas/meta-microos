SUMMARY = "Severed fonts for texlive-cm-lgc"
DESCRIPTION = "The  separated fonts package for texlive-cm-lgc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5svn28250"

RPM_NAME = "texlive-cm-lgc-fonts-2023.201.0.0.5svn28250-53.1.noarch.rpm"
RPM_HASH = "f61ddda4742400de72df6c0b483016576e9a2775abb8bc64379e420da8d019c9e54149325db4717677022e3097b2bdcab05df4b6e659fbdfa96bdb3c406c73a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=aa) \
font(:lang=an) \
font(:lang=av) \
font(:lang=ay) \
font(:lang=ba) \
font(:lang=be) \
font(:lang=bg) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=bs) \
font(:lang=bua) \
font(:lang=ce) \
font(:lang=ch) \
font(:lang=co) \
font(:lang=cs) \
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
font(:lang=hr) \
font(:lang=hsb) \
font(:lang=ht) \
font(:lang=hu) \
font(:lang=ia) \
font(:lang=id) \
font(:lang=ie) \
font(:lang=ik) \
font(:lang=io) \
font(:lang=is) \
font(:lang=it) \
font(:lang=jv) \
font(:lang=kaa) \
font(:lang=kj) \
font(:lang=kk) \
font(:lang=kum) \
font(:lang=kwm) \
font(:lang=ky) \
font(:lang=lb) \
font(:lang=lez) \
font(:lang=lg) \
font(:lang=li) \
font(:lang=mg) \
font(:lang=mn-mn) \
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
font(:lang=rm) \
font(:lang=rn) \
font(:lang=ru) \
font(:lang=rw) \
font(:lang=sc) \
font(:lang=sel) \
font(:lang=sg) \
font(:lang=sk) \
font(:lang=sl) \
font(:lang=sma) \
font(:lang=smj) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=sq) \
font(:lang=sr) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=su) \
font(:lang=sv) \
font(:lang=sw) \
font(:lang=tg) \
font(:lang=tk) \
font(:lang=tl) \
font(:lang=tn) \
font(:lang=ts) \
font(:lang=tt) \
font(:lang=tyv) \
font(:lang=uk) \
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
font(cmroman) \
font(cmromanasian) \
font(cmromance) \
font(cmromancyrillic) \
font(cmromangreek) \
font(cmsans) \
font(cmsansasian) \
font(cmsansce) \
font(cmsanscyrillic) \
font(cmsansgreek) \
font(cmtypewriter) \
font(cmtypewriterasian) \
font(cmtypewriterce) \
font(cmtypewritercyrillic) \
font(cmtypewritergreek) \
texlive-cm-lgc-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
