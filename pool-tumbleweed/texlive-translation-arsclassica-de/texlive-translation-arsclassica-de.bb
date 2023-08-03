SUMMARY = "German version of arsclassica"
DESCRIPTION = "This is a 'translation' of the arsclassica documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23803"

RPM_NAME = "texlive-translation-arsclassica-de-2023.209.svn23803-53.1.noarch.rpm"
RPM_HASH = "adcd88e5ba9ba767ddf9ef2a8182bd6dbc57f8d72e02b34a819e48a27984f6f837a31600ffc3e8458fa3b0ffaae21c170142eb068868e93acfca5c9f02aeac14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-arsclassica-de"

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
