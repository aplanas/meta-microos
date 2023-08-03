SUMMARY = "Memoir-based class for formatting University of Auckland masters' and doctors' theses"
DESCRIPTION = "A memoir-based class for formatting University of Auckland \
masters' and doctors' thesis dissertations in any discipline. \
The title page does not handle short dissertations for \
diplomas."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51323"

RPM_NAME = "texlive-aucklandthesis-2023.209.svn51323-54.1.noarch.rpm"
RPM_HASH = "fc50eea4647476b61a2c8ece774fb1be2887f2383b56faed67e6f1aeb094ea0e3ece0e8db88993753c9734ad9fffc210f03566aa1f30754fc21fea84b102ee97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aucklandthesis.cls \
texlive-aucklandthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-memoir.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
