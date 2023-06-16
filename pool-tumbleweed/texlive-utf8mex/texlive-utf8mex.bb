SUMMARY = "Tools to produce formats that read Polish language input"
DESCRIPTION = "The bundle provides files for building formats to read input in \
Polish encodings."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-utf8mex-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "f4694b631d8c355399c4ca95e1e63c66c54ab452fa87d66851e30ee2491b8937f4c9e7d64889c4d4e4a6fefc4256baf8d43c831aaea8fd744d9ca66b0a2fa3ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-utf8-pl.tex \
tex-utf8plsq.tex \
texlive-utf8mex"

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
