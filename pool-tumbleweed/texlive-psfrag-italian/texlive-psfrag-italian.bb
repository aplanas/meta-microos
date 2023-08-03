SUMMARY = "PSfrag documentation in Italian"
DESCRIPTION = "This is a translation of the documentation that comes with the \
psfrag documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-psfrag-italian-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "d2312a1ab40d225561500a4eee4e2783bf983c0ad1bf3740aaa11216674f17b0cc866d902fdffeb4ed883c3e54cb2e42acf097ebb8ec0e243aba19e7a38647d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psfrag-italian"

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
