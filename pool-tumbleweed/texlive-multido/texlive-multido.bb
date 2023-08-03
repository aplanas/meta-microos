SUMMARY = "A loop facility for Generic TeX"
DESCRIPTION = "The package provides the \\multido command, which was originally \
designed for use with PSTricks. Fixed-point arithmetic is used \
when working on the loop variable, so that the package is \
equally applicable in graphics applications like PSTricks as it \
is with the more common integer loops."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.42svn18302"

RPM_NAME = "texlive-multido-2023.209.1.42svn18302-55.1.noarch.rpm"
RPM_HASH = "5197f1d6986f09611c7ce4e29752085e7b191bf621541431017c5741aaccd8bd7fdeb1fb6285d90523cbdb8735b4f9153b09099cd0e5bbd8685a927680cda2ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multido.sty \
tex-multido.tex \
texlive-multido"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
