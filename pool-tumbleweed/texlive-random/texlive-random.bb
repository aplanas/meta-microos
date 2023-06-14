SUMMARY = "Generating 'random' numbers in TeX"
DESCRIPTION = "Generates pseudo-random integers in the range 1 to 2^{31}. \
Macros are to provide random integers in a given range, or \
random dimensions which can be used to provide random `real' \
numbers, are also available."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn54723"

RPM_NAME = "texlive-random-2023.201.0.0.2svn54723-53.1.noarch.rpm"
RPM_HASH = "ba3373141ef4b741ee4daae7944e9ca5f7bbabbc59732579d25d87a9997774654855263acb67efe3287ea46e270cd00e29abf963bf2957c4d8fe701bf87b22a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-random.tex \
texlive-random"

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
