SUMMARY = "Plain TeX file for using epsf.tex with (x)dvipdfmx"
DESCRIPTION = "epsf-dvipdfmx.tex is a plain TeX file to be \\input after \
epsf.tex when using plain TeX with dvipdfmx. As in: \\input epsf \
\\input epsf-dvipdfmx It is needed when an .eps file has \
anything except the origin (0,0) for the lower-left of its \
bounding box."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-2023.201.2014svn35575-53.1.noarch.rpm"
RPM_HASH = "3e91bcac56ef00b2886daf36ba203f47b92ad0eab1ffa5591222da6b6f443ed0f4a08319ff8a84019486d7282e92f2e858cefb29260579dc5534912380074db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsf-dvipdfmx.tex \
texlive-epsf-dvipdfmx"

RDEPENDS:${PN} += "/bin/sh \
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
