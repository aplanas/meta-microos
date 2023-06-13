SUMMARY = "German HTML beamer presentation on nicetext and morehype"
DESCRIPTION = "The bundle: exhibits the process of making an 'HTML beamer \
presentation' with the blogdot package from the morehype \
bundle, and HTML generation based on the fifinddo package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn29349"

RPM_NAME = "texlive-fifinddo-info-2023.201.1.1bsvn29349-52.1.noarch.rpm"
RPM_HASH = "3c9fdfc0c5c7d1bf0d4e700febd85cf6c88557c31301678fa1773a5168158cc99e8cb0d04bd4aec9c861d942432bf3e9e12b83689b5e953a7834004f22e1393b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fifinddo-info"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
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
