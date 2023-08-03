SUMMARY = "Irish language module for glossaries package"
DESCRIPTION = "Irish language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "6f70c1caeff430a4382f5c5ca2c4c5a27acdda916961fa625f94726169d38a8076886c416d048ff50f7f29f8bbc72e3bf0d8d93257895937a1397674dd3c0269"
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
