SUMMARY = "Generating 'random' numbers in TeX"
DESCRIPTION = "Generates pseudo-random integers in the range 1 to 2^{31}. \
Macros are to provide random integers in a given range, or \
random dimensions which can be used to provide random `real' \
numbers, are also available."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn54723"

RPM_NAME = "texlive-random-2023.201.0.0.2svn54723-53.2.noarch.rpm"
RPM_HASH = "c8d1007bf928071f5ba2e3510de17fe5c53342b503cc1a1c52d3e675c612073c3c47716cd4a8fd52dfd4aa15e67707a1329e1bfb7ef90bfcc3b78adbbe6d24e5"
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
