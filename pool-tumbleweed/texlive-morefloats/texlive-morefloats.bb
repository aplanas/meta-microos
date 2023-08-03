SUMMARY = "Increase the number of simultaneous LaTeX floats"
DESCRIPTION = "LaTeX can, by default, only cope with 18 outstanding floats; \
any more, and you get the error 'too many unprocessed floats'. \
This package releases the limit; TeX itself imposes limits \
(which are independent of the help offered by e-TeX). However, \
if your floats can't be placed anywhere, extending the number \
of floats merely delays the arrival of the inevitable error \
message."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn37927"

RPM_NAME = "texlive-morefloats-2023.209.1.0hsvn37927-55.1.noarch.rpm"
RPM_HASH = "0cf33e90d9140349baf1841eae310aac325a263c2ab69ec1ae3a0ec1613fa7b082b03b2d83a9d21e406224939d10fc5fce95de9d8d939dcd6000075db8f9bc4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morefloats.sty \
texlive-morefloats"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifetex.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
