SUMMARY = "A firework display in obfuscated TeX"
DESCRIPTION = "The output PDF file gives an amusing display, as the reader \
pages through it."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.20120102svn25020"

RPM_NAME = "texlive-happy4th-2023.209.20120102svn25020-54.2.noarch.rpm"
RPM_HASH = "f1cddcc26cf8a75bef63ef3824360ec30392b42c0d809d1d27c7476981886a2ff9174496d14db89a19f988d9b6b8a7e38ac7c69c77eaee03a9178713b3307d6b"
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
