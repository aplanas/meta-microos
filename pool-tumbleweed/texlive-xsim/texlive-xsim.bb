SUMMARY = "EXercise Sheets IMproved"
DESCRIPTION = "This package helps in creating exercises and the corresponding \
solutions. It is the official successor of the exsheets package \
and fixes/improves various long-standing issues."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn61988"

RPM_NAME = "texlive-xsim-2023.201.0.0.21svn61988-52.2.noarch.rpm"
RPM_HASH = "5884008edae5ce06c9982b18d31886920f9654d23afb1b8038012bb3ab6fb4cbddcf8adb4e0504103e510e5d2047025fa84d7598187858df9c8204ac7d46b560"
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
