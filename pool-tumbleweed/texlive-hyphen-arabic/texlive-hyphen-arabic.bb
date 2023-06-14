SUMMARY = "(No) Arabic hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Arabic."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54568"

RPM_NAME = "texlive-hyphen-arabic-2023.201.svn54568-52.1.noarch.rpm"
RPM_HASH = "24c37f89b600e8a6fca45b256522b85656d90bcc0b1da4b2d06f764218e8a77bce156e030087d58936d1f9b3d5dc4ad31b1106c29b1d5f336a4b2f4aa31fde4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-arabic"

RDEPENDS:${PN} += "/bin/sh \
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
