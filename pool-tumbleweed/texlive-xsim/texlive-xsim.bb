SUMMARY = "EXercise Sheets IMproved"
DESCRIPTION = "This package helps in creating exercises and the corresponding \
solutions. It is the official successor of the exsheets package \
and fixes/improves various long-standing issues."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn61988"

RPM_NAME = "texlive-xsim-2023.209.0.0.21svn61988-53.1.noarch.rpm"
RPM_HASH = "b60bf6087d327347d4f73bbc5169df6c762f06850efc968aabf4924ea4361c3b174e0d04e59ff7184e72212f1d69b6a3d5831e691c73864da0f79dbe7139ef58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xsim-manual.cls \
tex-xsim.sty \
tex-xsim.style.layouts.code.tex \
tex-xsimverb.sty \
texlive-xsim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-acro.sty \
tex-amsmath.sty \
tex-array.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-cnltx-doc.cls \
tex-csquotes.sty \
tex-datetime2.sty \
tex-embrac.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-imakeidx.sty \
tex-l3keys2e.sty \
tex-lipsum.sty \
tex-longtable.sty \
tex-marginnote.sty \
tex-newtxmath.sty \
tex-refcount.sty \
tex-tcolorbox.sty \
tex-translations.sty \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
