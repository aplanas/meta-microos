SUMMARY = "(No) Arabic hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Arabic."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54568"

RPM_NAME = "texlive-hyphen-arabic-2023.208.svn54568-53.1.noarch.rpm"
RPM_HASH = "d85e80fca94dc5717894128eadba3235fe648c5bd4539780fe96c93ee3ebb914d444b800b08178e2d1d687e2ac5d36fa723dbfb18aa52c37a5d52964c57cc2af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-arabic"

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
