SUMMARY = "Typeset Python, C and Pascal programs"
DESCRIPTION = "A TeX macro package for easy typesetting programs in Python, C \
and Pascal. Program source files may also be input."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn18337"

RPM_NAME = "texlive-c-pascal-2023.201.1.2svn18337-52.1.noarch.rpm"
RPM_HASH = "278bd0002509d2bb23e7770ab89a6dd37f64e786f32d0e09b019165b1c4aa923db3effcc34626aa36e68db3b30e5fa8c365f4edb7b3c9c4b670016ba26857fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cap-c.tex \
tex-cap-comm.tex \
tex-cap-pas.tex \
tex-cap-pyt.tex \
tex-cap.tex \
texlive-c-pascal"

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
