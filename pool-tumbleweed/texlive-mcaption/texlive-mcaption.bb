SUMMARY = "Put captions in the margin"
DESCRIPTION = "The mcaption package provides an mcaption environment which \
puts figure or table captions in the margin. The package works \
with the standard classes and with the KOMA-Script document \
classes scrartcl, scrreprt and scrbook. The package requires \
the changepage package."
LICENSE = "LPPL-1.0"

PV = "2023.208.3.0svn15878"

RPM_NAME = "texlive-mcaption-2023.208.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "d4e90e80696a706ece8437feb8e5860b799975aaeab961581c6fcb6da41eafdf0a9901fc27f5fde547b91e29cece8a10af99641cd709d19c93361e4db1cbcf54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mcaption.sty \
texlive-mcaption"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changepage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
