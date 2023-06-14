SUMMARY = "Modern Russian typesetting"
DESCRIPTION = "Eskdx is a collection of LaTeX classes and packages to typeset \
textual and graphical documents in accordance with Russian (and \
probably post USSR) standards for designers."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98svn29235"

RPM_NAME = "texlive-eskdx-2023.201.0.0.98svn29235-52.1.noarch.rpm"
RPM_HASH = "2c41ae1e222ccd6db000c5ad065ee7e50bfe36ca076c3fd256474ca57d1f46d7bcd75253bd284935fdcd926f305985cf1f7fe4a1922e35ec85adcd6092d50f82"
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

RDEPENDS:${PN} += "/bin/sh \
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
