SUMMARY = "Generating 'random' numbers in TeX"
DESCRIPTION = "Generates pseudo-random integers in the range 1 to 2^{31}. \
Macros are to provide random integers in a given range, or \
random dimensions which can be used to provide random `real' \
numbers, are also available."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn54723"

RPM_NAME = "texlive-random-2023.209.0.0.2svn54723-54.2.noarch.rpm"
RPM_HASH = "233c19260b497185b6dd10b8b7e1db4b1555c5574a4f4e678e0516e6ae3236b952c204649819c652fa35a6a5e6046ab5bd464d5ca154c7a154c2d646fbe462b7"
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
