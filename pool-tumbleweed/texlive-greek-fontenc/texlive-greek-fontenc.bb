SUMMARY = "LICR macros and encoding definition files for Greek"
DESCRIPTION = "The package provides Greek LICR macro definitions and encoding \
definition files for Greek text font encodings for use with \
fontenc."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-2023.201.2.2.1svn66513-53.2.noarch.rpm"
RPM_HASH = "0131b166c668f3ba35327e09b0d2002ffe44696200269f3566db933463ac4979e84d3325dcd675bb504d4c9f1894ab49debabbfb5f3dd6f5255ef305200f31bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alphabeta-lgr.def \
tex-alphabeta-tuenc.def \
tex-alphabeta.sty \
tex-greek-euenc.def \
tex-greek-fontenc.def \
tex-lgrenc.def \
tex-puenc-greek.def \
tex-textalpha.sty \
tex-tuenc-greek.def \
texlive-greek-fontenc"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh \
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
