SUMMARY = "Modern Russian typesetting"
DESCRIPTION = "Eskdx is a collection of LaTeX classes and packages to typeset \
textual and graphical documents in accordance with Russian (and \
probably post USSR) standards for designers."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98svn29235"

RPM_NAME = "texlive-eskdx-2023.209.0.0.98svn29235-53.1.noarch.rpm"
RPM_HASH = "6b37341bcc61f1c41baaba3276811aa19d3f3142ef9e3892122ccd5a9fc1435d985782e61105384524e5de421c15799e06c30a75527c69db7fa34e6907ecd436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eskdafterpkg.sty \
tex-eskdappsheet.sty \
tex-eskdbiblist.sty \
tex-eskdcap.sty \
tex-eskdchngsheet.sty \
tex-eskddstu.sty \
tex-eskdexplan.sty \
tex-eskdfont.sty \
tex-eskdfootnote.sty \
tex-eskdfreesize.sty \
tex-eskdgraph.cls \
tex-eskdhash.sty \
tex-eskdindent.sty \
tex-eskdinfo.sty \
tex-eskdlang.sty \
tex-eskdlist.sty \
tex-eskdpara.sty \
tex-eskdplain.sty \
tex-eskdrussian.def \
tex-eskdsect.sty \
tex-eskdspec.sty \
tex-eskdspecii.sty \
tex-eskdstamp.sty \
tex-eskdtab.cls \
tex-eskdtext.cls \
tex-eskdtitle.sty \
tex-eskdtitlebase.sty \
tex-eskdtotal.sty \
tex-eskdukrainian.def \
texlive-eskdx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-calc.sty \
tex-caption.sty \
tex-chngpage.sty \
tex-everyshi.sty \
tex-extarticle.cls \
tex-ifpdf.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-lscape.sty \
tex-rotating.sty \
tex-zref-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
