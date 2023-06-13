SUMMARY = "Serbian language module for glossaries package"
DESCRIPTION = "Serbian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "03faa220e1654fbb3ca0dce89a38635ee7fcd20fb67942228b487e79f48576076dd72cdb54f80ce4d93e784f914e4b5227297bb8c5693819b08795d7d2e551d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-serbian-noenc.ldf) \
tex(glossaries-serbian-utf8.ldf) \
tex(glossaries-serbian.ldf) \
texlive-glossaries-serbian"

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
