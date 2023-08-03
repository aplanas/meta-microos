SUMMARY = "Support for Indonesian within babel"
DESCRIPTION = "This is the babel style for Indonesian."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0msvn43235"

RPM_NAME = "texlive-babel-indonesian-2023.209.1.0msvn43235-54.1.noarch.rpm"
RPM_HASH = "7a74dcc9b6b978e864c55001886b336c34679a01684b51f292e5eb4519aca5b458be425687ae5c341ecb676dd2a880421f9adb02591f82376edf21b43645aa81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bahasa.ldf \
tex-bahasai.ldf \
tex-indon.ldf \
tex-indonesian.ldf \
texlive-babel-indonesian"

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
