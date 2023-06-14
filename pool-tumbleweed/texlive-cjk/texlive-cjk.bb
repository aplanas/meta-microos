SUMMARY = "CJK language support"
DESCRIPTION = "CJK is a macro package for LaTeX, providing simultaneous \
support for various Asian scripts in many encodings (including \
Unicode): Chinese (both traditional and simplified), Japanese, \
Korean and Thai. A special add-on feature is an interface to \
the Emacs editor (cjk-enc.el) which gives simultaneous, \
easy-to-use support to a bunch of other scripts in addition to \
the above -- Cyrillic, Greek, Latin-based scripts, Russian and \
Vietnamese are supported."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.8.5svn60865"

RPM_NAME = "texlive-cjk-2023.201.4.8.5svn60865-53.1.noarch.rpm"
RPM_HASH = "529f940d41d7a120a24d1e34ff32495a15c9f20d4f9d39d080c9b348eccd116c271248a367a2ee0a037d90b6a5bbae98735e6243ba98e4ea822054776835db10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Bg5.enc \
tex-CJK.enc \
tex-CJK.sty \
tex-CJKfntef.sty \
tex-CJKnumb.sty \
tex-CJKspace.sty \
tex-CJKulem.sty \
tex-CJKutf8.sty \
tex-CJKvert.sty \
tex-EUC-JP.enc \
tex-EUC-JPdnp.enc \
tex-EUC-TW.enc \
tex-HK.enc \
tex-JISdnp.enc \
tex-KS.enc \
tex-KSHL.enc \
tex-MULEenc.sty \
tex-SJIS.enc \
tex-SJISdnp.enc \
tex-UTF8.enc \
tex-c00bkai.fd \
tex-c00bsmi.fd \
tex-c00bsmir.fd \
tex-c00cns.fd \
tex-c00fs.fd \
tex-c00kai.fd \
tex-c00kair.fd \
tex-c00song.fd \
tex-c01song.fd \
tex-c05song.fd \
tex-c09song.fd \
tex-c10fs.fd \
tex-c10gbsn.fd \
tex-c10gkai.fd \
tex-c10song.fd \
tex-c11song.fd \
tex-c19song.fd \
tex-c20song.fd \
tex-c21song.fd \
tex-c31song.fd \
tex-c32song.fd \
tex-c33song.fd \
tex-c34song.fd \
tex-c35song.fd \
tex-c36song.fd \
tex-c37song.fd \
tex-c40song.fd \
tex-c41song.fd \
tex-c42goth.fd \
tex-c42maru.fd \
tex-c42min.fd \
tex-c42song.fd \
tex-c43song.fd \
tex-c49song.fd \
tex-c50song.fd \
tex-c52maru.fd \
tex-c52min.fd \
tex-c60dr.fd \
tex-c60gr.fd \
tex-c60gs.fd \
tex-c60gt.fd \
tex-c60hgt.fd \
tex-c60hmj.fd \
tex-c60hol.fd \
tex-c60hpg.fd \
tex-c60mj.fd \
tex-c61dr.fd \
tex-c61gr.fd \
tex-c61gs.fd \
tex-c61gt.fd \
tex-c61hgt.fd \
tex-c61hmj.fd \
tex-c61hol.fd \
tex-c61hpg.fd \
tex-c61mj.fd \
tex-c62song.fd \
tex-c63bm.fd \
tex-c63dn.fd \
tex-c63gr.fd \
tex-c63gs.fd \
tex-c63gt.fd \
tex-c63jgt.fd \
tex-c63jmj.fd \
tex-c63jnv.fd \
tex-c63jsr.fd \
tex-c63mj.fd \
tex-c63pg.fd \
tex-c63pga.fd \
tex-c63ph.fd \
tex-c63pn.fd \
tex-c63sh.fd \
tex-c63tz.fd \
tex-c63vd.fd \
tex-c63yt.fd \
tex-c64bm.fd \
tex-c64dn.fd \
tex-c64gr.fd \
tex-c64gs.fd \
tex-c64gt.fd \
tex-c64jgt.fd \
tex-c64jmj.fd \
tex-c64jnv.fd \
tex-c64jsr.fd \
tex-c64mj.fd \
tex-c64pg.fd \
tex-c64pga.fd \
tex-c64ph.fd \
tex-c64pn.fd \
tex-c64sh.fd \
tex-c64tz.fd \
tex-c64vd.fd \
tex-c64yt.fd \
tex-c65bm.fd \
tex-c65dn.fd \
tex-c65gr.fd \
tex-c65gs.fd \
tex-c65gt.fd \
tex-c65jgt.fd \
tex-c65jmj.fd \
tex-c65jnv.fd \
tex-c65jsr.fd \
tex-c65mj.fd \
tex-c65pg.fd \
tex-c65pga.fd \
tex-c65ph.fd \
tex-c65pn.fd \
tex-c65sh.fd \
tex-c65tz.fd \
tex-c65vd.fd \
tex-c65yt.fd \
tex-c70bkai.fd \
tex-c70bsmi.fd \
tex-c70gbsn.fd \
tex-c70gkai.fd \
tex-c70goth.fd \
tex-c70maru.fd \
tex-c70min.fd \
tex-c70mj.fd \
tex-c70song.fd \
tex-c80song.fd \
tex-c81song.fd \
tex-c90cmr.fd \
tex-c90cmss.fd \
tex-c90cmtt.fd \
tex-c90enc.def \
tex-c90gar.fd \
tex-c90nrsr.fd \
tex-extended.enc \
tex-pinyin.ldf \
tex-pinyin.sty \
tex-pmCbig.enc \
tex-pmCsmall.enc \
tex-pshan.sty \
tex-ruby.sty \
tex-standard.enc \
tex-thaicjk.ldf \
texlive-cjk"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-inputenc.sty \
tex-ulem.sty \
texlive \
texlive-arphic \
texlive-cns \
texlive-filesystem \
texlive-garuda-c90 \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-norasi-c90 \
texlive-scripts \
texlive-scripts-bin \
texlive-uhc \
texlive-wadalab"

inherit rpm
