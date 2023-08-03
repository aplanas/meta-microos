SUMMARY = "Left indices with better spacing"
DESCRIPTION = "This package provides commands for typesetting left indices. \
Unlike other similar packages, leftindex also indents the left \
superscript, providing much better spacing in general."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1betasvn56182"

RPM_NAME = "texlive-leftindex-2023.209.0.0.1betasvn56182-55.1.noarch.rpm"
RPM_HASH = "211fde10211e3e1e1f05879105021643f05593eaffa57fdf76c181441d57c0828a182ee1ac9d43141ae479bed397f5536fd07e06299e8e07adc012e9ddc552f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leftindex.sty \
texlive-leftindex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
