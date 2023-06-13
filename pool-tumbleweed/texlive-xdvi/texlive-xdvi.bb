SUMMARY = "A DVI previewer for the X Window System"
DESCRIPTION = "The canonical previewer for use on Unix and other X-windows \
based systems. The distribution has been integrated with that \
of xdvik (no longer separately available), so that it will \
build with web2c 'out of the box'. It is included in TeX Live."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62387"

RPM_NAME = "texlive-xdvi-2023.201.svn62387-52.1.noarch.rpm"
RPM_HASH = "949436ba3fa68165b9cfa4797f17b499eec1496c0ea2f347608bf3f3c14d7cc59efda3ceefbb2b69014f016e941056317d5d42a1b35246a56a1511986e13a67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-xdvi) \
texlive-xdvi"

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
texlive-scripts-bin \
texlive-xdvi-bin"

inherit rpm
