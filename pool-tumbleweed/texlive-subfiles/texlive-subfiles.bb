SUMMARY = "Individual typesetting of subfiles of a 'main' document"
DESCRIPTION = "Using this package the user can handle multi-file projects more \
comfortably, making it possible to both process the subsidiary \
files by themselves and to process the main file that includes \
them, without making any changes to either."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn56977"

RPM_NAME = "texlive-subfiles-2023.209.2.2svn56977-58.1.noarch.rpm"
RPM_HASH = "23880e0b8a609e62b664924b52f142996d1d14830dbaf0f67d0df45f8a7b5da644e2a6e662f028220470a038ae653f749838adb13d7ce76627f3c167168f465a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfiles.cls \
tex-subfiles.sty \
texlive-subfiles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-import.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-import \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
