SUMMARY = "Severed fonts for texlive-comicneue"
DESCRIPTION = "The  separated fonts package for texlive-comicneue"
LICENSE = "OFL-1.1"

PV = "2023.201.1.2svn54891"

RPM_NAME = "texlive-comicneue-fonts-2023.201.1.2svn54891-53.1.noarch.rpm"
RPM_HASH = "298593dde0fb510eefe48e0e697bc1d9284275de7d00a4aaa3a1daa02518ba340cb3872f7d7224ed5b40fcd001736bfc5e5b4979b2df56a951cbe19ee60c3a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-comicneue-fonts) \
font(:lang=aa) \
font(:lang=an) \
font(:lang=ay) \
font(:lang=bi) \
font(:lang=br) \
font(:lang=bs) \
font(:lang=ch) \
font(:lang=co) \
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
font(:lang=gv) \
font(:lang=ho) \
font(:lang=hr) \
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
font(:lang=ny) \
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
font(:lang=sl) \
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
font(:lang=ts) \
font(:lang=uz) \
font(:lang=vo) \
font(:lang=vot) \
font(:lang=wa) \
font(:lang=wen) \
font(:lang=xh) \
font(:lang=yap) \
font(:lang=za) \
font(:lang=zu) \
font(comicneue) \
font(comicneue-bold) \
font(comicneue-bolditalic) \
font(comicneue-italic) \
font(comicneue-light) \
font(comicneue-lightitalic) \
font(comicneue-regular) \
font(comicneueangular) \
font(comicneueangular-bold) \
font(comicneueangular-bolditalic) \
font(comicneueangular-bolditaliclcdfj) \
font(comicneueangular-boldlcdfj) \
font(comicneueangular-italic) \
font(comicneueangular-italiclcdfj) \
font(comicneueangular-light) \
font(comicneueangular-lightitalic) \
font(comicneueangular-lightitaliclcdfj) \
font(comicneueangular-lightlcdfj) \
font(comicneueangular-regular) \
font(comicneueangular-regularlcdfj) \
font(comicneueangularlight) \
font(comicneueangularlightitalic) \
font(comicneuelight) \
texlive-comicneue-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
