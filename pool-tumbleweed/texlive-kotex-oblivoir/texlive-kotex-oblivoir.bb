SUMMARY = "A LaTeX document class for typesetting Korean documents"
DESCRIPTION = "The class is based on memoir, and is adapted to typesetting \
Korean documents. The bundle (of class and associated packages) \
belongs to the ko.TeX bundle. It depends on memoir and \
kotex-utf to function."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.1svn66513"

RPM_NAME = "texlive-kotex-oblivoir-2023.209.3.2.1svn66513-56.1.noarch.rpm"
RPM_HASH = "3fd7c1489cc9791b19e046a0c6b28bc967a41a66a7772880bae3148ad01149135d9deca5ef3b7f855ea8cd6f3212a282a72c55e90486b3480854d461cbde16bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-10-5.sty \
tex-fapapersize.sty \
tex-hfontsel.sty \
tex-memhangul-common.sty \
tex-memhangul-patch.sty \
tex-memhangul-ucs.sty \
tex-memhangul-x.sty \
tex-memucs-enumerate.sty \
tex-memucs-gremph.sty \
tex-memucs-interword-x.sty \
tex-memucs-interword.sty \
tex-memucs-setspace.sty \
tex-nanumfontsel.sty \
tex-ob-koreanappendix.sty \
tex-ob-mathleading.sty \
tex-ob-nokoreanappendix.sty \
tex-ob-toclof.sty \
tex-ob-unfontsdefault.sty \
tex-obchaptertoc.sty \
tex-oblivoir-misc.sty \
tex-oblivoir-utf.cls \
tex-oblivoir-xl.cls \
tex-oblivoir.cls \
tex-xetexko-var.sty \
tex-xob-amssymb.sty \
tex-xob-dotemph.sty \
tex-xob-font.sty \
tex-xob-hyper.sty \
tex-xob-lwarp.sty \
tex-xob-paralist.sty \
tex-xoblivoir.cls \
texlive-kotex-oblivoir"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-cjkutf8-ko.sty \
tex-dhucs-cmap.sty \
tex-dhucs-paralist.sty \
tex-dhucs.sty \
tex-enumerate.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-iftex.sty \
tex-ifxetex.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
tex-kotex.sty \
tex-l3keys2e.sty \
tex-luatexko.sty \
tex-lwarp.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-moreverb.sty \
tex-paralist.sty \
tex-polyglossia.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-xetexko-font.sty \
tex-xetexko-hanging.sty \
tex-xetexko-josa.sty \
tex-xetexko-space.sty \
tex-xetexko-vertical.sty \
tex-xetexko.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kotex-utf \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-memoir \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
