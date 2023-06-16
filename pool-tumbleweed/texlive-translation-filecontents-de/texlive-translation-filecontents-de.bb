SUMMARY = "German version of filecontents"
DESCRIPTION = "This is a 'translation' of the filecontents documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24010"

RPM_NAME = "texlive-translation-filecontents-de-2023.201.svn24010-52.1.noarch.rpm"
RPM_HASH = "1e5530bcda9a4fd730da2ab6fb9fff755c61f554b3740a96f2107f2d2ac95f8dcdd760b694cb7c463cba34102da8c1b0c15357655d0bfa0ad330edeca1c12009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-filecontents-de"

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
