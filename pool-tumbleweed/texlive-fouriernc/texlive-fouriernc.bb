SUMMARY = "Use New Century Schoolbook text with Fourier maths fonts"
DESCRIPTION = "This package provides a LaTeX mathematics font setup for use \
with New Century Schoolbook text. In order to use it you need \
to have the Fourier-GUTenberg fonts installed."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29646"

RPM_NAME = "texlive-fouriernc-2023.209.svn29646-53.1.noarch.rpm"
RPM_HASH = "129fe66d4336a3919c4064268e2b8bf79aef92b1c6bf4dd4df9ce4c8fb8dd74dea12cfb118cde5f76ed46598f950b374a8f740a6490ac4e4d208a10df20586f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fmlfncm.fd \
tex-fmlfncmi.fd \
tex-fmsfncm.fd \
tex-fncmi.tfm \
tex-fncmi.vf \
tex-fncmib.tfm \
tex-fncmib.vf \
tex-fncmii.tfm \
tex-fncmii.vf \
tex-fncmiib.tfm \
tex-fncmiib.vf \
tex-fncsy.tfm \
tex-fncsy.vf \
tex-fouriernc.sty \
tex-t1fnc.fd \
tex-ts1fnc.fd \
texlive-fouriernc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fourier-mcl.tfm \
tex-fourier-ml.tfm \
tex-fourier-mlb.tfm \
tex-fourier-mlit.tfm \
tex-fourier-mlitb.tfm \
tex-fourier-ms.tfm \
tex-fourier.sty \
tex-pncb8r.tfm \
tex-pncbi8r.tfm \
tex-pncr8r.tfm \
tex-pncri8r.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
