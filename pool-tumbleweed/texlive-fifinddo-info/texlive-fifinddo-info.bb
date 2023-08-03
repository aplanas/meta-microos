SUMMARY = "German HTML beamer presentation on nicetext and morehype"
DESCRIPTION = "The bundle: exhibits the process of making an 'HTML beamer \
presentation' with the blogdot package from the morehype \
bundle, and HTML generation based on the fifinddo package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn29349"

RPM_NAME = "texlive-fifinddo-info-2023.209.1.1bsvn29349-53.1.noarch.rpm"
RPM_HASH = "c04fa70b44ffe611da9814213bc0ff9d04d66ccc1cf6123d1c624b9060c00e7220fedcb68750d4109a2a30957b7669af4ae6e37a76806764bafdd25c2ac5c851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fifinddo-info"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
