SUMMARY = "Typeset the minutes of meetings"
DESCRIPTION = "Supports the creation of a collection of minutes. Features \
include: Support of tasks (who, schedule, what, time of \
finishing; possibility of creating a list of open tasks; \
inclusion of open tasks from other minutes; Support for \
attachments; Support of schedule dates (in planning: support \
for the calendar package); Different versions ('secret parts'); \
and Macros for votes and decisions (list of decisions). Support \
for minutes in German, Dutch and English is provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8fsvn42186"

RPM_NAME = "texlive-minutes-2023.209.1.8fsvn42186-55.1.noarch.rpm"
RPM_HASH = "03c3a1eef7ff9b8454bd2f82181ae55c654e8c96902be5518072a235c0dd16a2bb223053761b767d3eceab1be7c98eae8ddbf894112729e0e925cc5bb8c402fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minutes.sty \
texlive-minutes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-minitoc.sty \
tex-multicol.sty \
tex-url.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
