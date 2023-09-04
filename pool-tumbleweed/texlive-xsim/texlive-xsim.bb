SUMMARY = "EXercise Sheets IMproved"
DESCRIPTION = "This package helps in creating exercises and the corresponding \
solutions. It is the official successor of the exsheets package \
and fixes/improves various long-standing issues."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn61988"

RPM_NAME = "texlive-xsim-2023.209.0.0.21svn61988-53.2.noarch.rpm"
RPM_HASH = "590d1881088cd3d1988a54e5f5bd548cc3669fd2bbb9daaf37ada2aca8bd8837e503c88f54c21676c74ed25328d1c4807d0fb79c0ba7dd2519aca134e5e36751"
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
