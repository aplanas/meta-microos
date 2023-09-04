SUMMARY = "(No) Persian hyphenation patterns"
DESCRIPTION = "Prevent hyphenation in Persian."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54568"

RPM_NAME = "texlive-hyphen-farsi-2023.209.svn54568-54.1.noarch.rpm"
RPM_HASH = "2626d0107a26a9b9d5d1c966d00d5c0f14940c25406a0330ef5dd322f88850355adf130bcfe24f593ec79dd22a0d364ba6fb8b9c591e43cb5f2ad5dcdb1c881f"
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
