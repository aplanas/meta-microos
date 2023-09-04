SUMMARY = "Plain TeX file for using epsf.tex with (x)dvipdfmx"
DESCRIPTION = "epsf-dvipdfmx.tex is a plain TeX file to be \\input after \
epsf.tex when using plain TeX with dvipdfmx. As in: \\input epsf \
\\input epsf-dvipdfmx It is needed when an .eps file has \
anything except the origin (0,0) for the lower-left of its \
bounding box."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-2023.209.2014svn35575-54.2.noarch.rpm"
RPM_HASH = "73f4fde80c8aef4993abed438e9e508dea99ad271af5a129a86a6c8736768e743a03def9b78b670256938bc91964d122bd79fa9cbf388adc4244a9a29dc3056f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsf-dvipdfmx.tex \
texlive-epsf-dvipdfmx"

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
