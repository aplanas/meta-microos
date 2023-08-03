SUMMARY = "Versions of article class, tuned for scholarly publications"
DESCRIPTION = "A pair of classes derived from article, tuned for producing \
papers for journals. The classes introduce new layout options \
and font commands for sections/parts, and define a new keywords \
environment, subtitle and institution commands for the title \
section and new commands for revisions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0lsvn34521"

RPM_NAME = "texlive-paper-2023.209.1.0lsvn34521-52.1.noarch.rpm"
RPM_HASH = "9d295551b5133502281bd4dd2cc04870b59c995d5ac92cca4213dc028c6f0d105e1a44d375d0da81f4f40664faed49ba42f3625563b64901575f7cbd8059b41e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-journal.cls \
tex-journal.sty \
tex-paper.cls \
tex-paper.sty \
texlive-paper"

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
