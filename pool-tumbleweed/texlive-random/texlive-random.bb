SUMMARY = "Generating 'random' numbers in TeX"
DESCRIPTION = "Generates pseudo-random integers in the range 1 to 2^{31}. \
Macros are to provide random integers in a given range, or \
random dimensions which can be used to provide random `real' \
numbers, are also available."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn54723"

RPM_NAME = "texlive-random-2023.209.0.0.2svn54723-54.1.noarch.rpm"
RPM_HASH = "cc69497da6125a622e7f7d8280eaccca592de20965fd783cad8aad3848017ca4bfa4001702df91d00f1cd6fa35b6a77c29c52549bf1d1e2b69a11fa576d0fe2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-random.tex \
texlive-random"

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
