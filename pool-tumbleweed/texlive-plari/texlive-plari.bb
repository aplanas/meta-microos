SUMMARY = "Typesetting stageplay scripts"
DESCRIPTION = "Plari (the name comes from the Finnish usage for the working \
copy of a play) is a report-alike class, without section \
headings, and with paragraphs vertically separated rather than \
indented."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-plari-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "50dd77ceaa7da642c5ee88b9d7480a627d353af19833b479f5a69f3f8ff77881bc3b79846a46a41d5987bec7e86772b5587c50349868d44a1c51326e7bcbb420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plari.cls \
texlive-plari"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
