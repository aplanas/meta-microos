SUMMARY = "(No) Persian hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Persian."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54568"

RPM_NAME = "texlive-hyphen-farsi-2023.208.svn54568-53.1.noarch.rpm"
RPM_HASH = "23a66ba12f51dc164392b782d99454b8fb3151f2d500471cffbdee6d552995c77b77c5010f97f90a8efa8a3daa5119ee74498b469bd186f70c54144689af44a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-farsi"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
