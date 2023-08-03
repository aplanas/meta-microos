SUMMARY = "Vietnamese translation of documentation of ntheorem"
DESCRIPTION = "This is a translation of the documentation provided with \
ntheorem."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.203svn15878"

RPM_NAME = "texlive-ntheorem-vn-2023.209.1.203svn15878-55.1.noarch.rpm"
RPM_HASH = "c4fe948d1872c9207b16ac6aeef8fd669d5ec1f2c2f33cc63f8af061338aee50439a9207f2359272ebe6996bf55283b50dd6130c9a5de3d59e024c758da82c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ntheorem-vn"

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
