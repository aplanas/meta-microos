SUMMARY = "Polyglossia support for Occitan"
DESCRIPTION = "Occitan language description file for polyglossia"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-2023.201.0.0.1svn52593-53.1.noarch.rpm"
RPM_HASH = "1894cbdcd395d337b90d921da0020f60ed0d2e37edacb9da2790bea506191e86626d1b2edc1c7cb7efd1e384635e1fb5eafee92358b33cc3cfe8fda5add411fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan"

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
