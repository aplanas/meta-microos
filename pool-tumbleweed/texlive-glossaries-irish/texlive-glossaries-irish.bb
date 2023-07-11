SUMMARY = "Irish language module for glossaries package"
DESCRIPTION = "Irish language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "e1b99cf124903af3cb1c3da83044db2aafa7343a074a3973b227bbf65465f02d3470f5b3d195eb9125fd54b9b7f97d3726aa3f8ddb1e411d80e0ea2c3f1e1fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-irish-noenc.ldf \
tex-glossaries-irish-utf8.ldf \
tex-glossaries-irish.ldf \
texlive-glossaries-irish"

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
