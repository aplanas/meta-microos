SUMMARY = "Plain TeX file for using epsf.tex with (x)dvipdfmx"
DESCRIPTION = "epsf-dvipdfmx.tex is a plain TeX file to be \\input after \
epsf.tex when using plain TeX with dvipdfmx. As in: \\input epsf \
\\input epsf-dvipdfmx It is needed when an .eps file has \
anything except the origin (0,0) for the lower-left of its \
bounding box."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-2023.201.2014svn35575-53.2.noarch.rpm"
RPM_HASH = "5555f6361c53eb05578f02e493a10f34fd806df717eb7e554592f9709f42d3c7d75a2e3ea63f354bbf938ff1362e76cecae3d920f2230286e9429a370a9ea5ae"
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
