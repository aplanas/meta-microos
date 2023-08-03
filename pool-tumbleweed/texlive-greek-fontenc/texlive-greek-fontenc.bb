SUMMARY = "LICR macros and encoding definition files for Greek"
DESCRIPTION = "The package provides Greek LICR macro definitions and encoding \
definition files for Greek text font encodings for use with \
fontenc."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-2023.209.2.2.1svn66513-54.1.noarch.rpm"
RPM_HASH = "01260d3e50f5bd2e58ea5ce4a8e1c9b9237b7a23a8d9a7d26ed2d5a0d930f4b6027f4ee3d76ddb491f6ccbd35ca31d53c6c2c523b92b575e7c075b77db45819b"
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
