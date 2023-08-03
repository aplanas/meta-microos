SUMMARY = "Plain TeX file for using epsf.tex with (x)dvipdfmx"
DESCRIPTION = "epsf-dvipdfmx.tex is a plain TeX file to be \\input after \
epsf.tex when using plain TeX with dvipdfmx. As in: \\input epsf \
\\input epsf-dvipdfmx It is needed when an .eps file has \
anything except the origin (0,0) for the lower-left of its \
bounding box."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2014svn35575"

RPM_NAME = "texlive-epsf-dvipdfmx-2023.209.2014svn35575-54.1.noarch.rpm"
RPM_HASH = "40dac07b9e8ae41679dfa9db4f9a30c4fe9fc8b42f63a51495c95db5ce30cadba70a94c3cb8904039ed33b56fb4e5bf78c802b6a3e5e3ef5ef8fb0228db6a9eb"
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
