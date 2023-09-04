SUMMARY = "LICR macros and encoding definition files for Greek"
DESCRIPTION = "The package provides Greek LICR macro definitions and encoding \
definition files for Greek text font encodings for use with \
fontenc."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn66513"

RPM_NAME = "texlive-greek-fontenc-2023.209.2.2.1svn66513-54.2.noarch.rpm"
RPM_HASH = "132fbf0a81036dd62bb87f924cf6cfb21d7bbb2fd882b28e8bb708d3b4f59c762c609adccd1a84337a95785de802c5f5a09eb89ec06505388718ae0d67ab5c9e"
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
