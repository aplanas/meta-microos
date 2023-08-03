SUMMARY = "Extended TeX"
DESCRIPTION = "An development of omega, using most of the extensions of TeX \
itself developed for e-TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-aleph-2023.209.svn66203-55.1.noarch.rpm"
RPM_HASH = "ad99422034fa04d24b9d57eafcb76bee9d83a68129fb5fcab764cfd73548889ceac9f1a94d50c977412fbc0fd628d4c2859db587f0980bc65e0cad7a865946ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-aleph.1 \
texlive-aleph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-aleph-bin \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lambda \
texlive-latex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
