SUMMARY = "An 'end of proof' sign"
DESCRIPTION = "This package provides an additional 'end of proof' sign. The \
command's name is \\wasserdicht."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55643"

RPM_NAME = "texlive-endofproofwd-2023.209.svn55643-54.2.noarch.rpm"
RPM_HASH = "2f9f2edfd5d7832bdc60075f12d257def6a6e002d7439c8673f2f46d55352b26f15f52f53e10333a06f7abb5e95c31185e198e423c851babc0d7f3dee3524168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endofproofwd.sty \
texlive-endofproofwd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-import.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
