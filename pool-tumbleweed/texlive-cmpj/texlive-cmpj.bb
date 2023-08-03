SUMMARY = "Style for the journal Condensed Matter Physics"
DESCRIPTION = "The package contains macros and some documentation for \
typesetting papers for submission to the Condensed Matter \
Physics journal published by the Institute for Condensed Matter \
Physics of the National Academy of Sciences of Ukraine."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.03svn58506"

RPM_NAME = "texlive-cmpj-2023.209.3.03svn58506-54.1.noarch.rpm"
RPM_HASH = "f38ccb266536ebca9190fd1497707e247dc0aca48f7d2b4a37828041e07a0c089cb346d4bec2097848924fb06a75f777b6482ba30e3f15ebf0a46ea6be496f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmpj.sty \
tex-cmpj2.sty \
tex-cmpj3.sty \
texlive-cmpj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-doi.sty \
tex-droidsans.sty \
tex-droidsansmono.sty \
tex-droidserif.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fourier.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-ifthen.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-scalerel.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-txfonts.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
