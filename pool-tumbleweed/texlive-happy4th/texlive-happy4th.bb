SUMMARY = "A firework display in obfuscated TeX"
DESCRIPTION = "The output PDF file gives an amusing display, as the reader \
pages through it."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.20120102svn25020"

RPM_NAME = "texlive-happy4th-2023.201.20120102svn25020-53.2.noarch.rpm"
RPM_HASH = "03cc0899ab7cdef97413c44de9a20744ebb19291037a2babd06b13e5e0d8713c297d8425a53580bf460bfec5e3f3518773ea3946a2604d39a941123659243c69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-happy4th"

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
