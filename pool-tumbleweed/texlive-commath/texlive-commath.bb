SUMMARY = "Mathematics typesetting support"
DESCRIPTION = "Provides a range of differential, partial differential and \
delimiter commands, together with a \\fullfunction (function, \
with both domain and range, and function operation) and various \
reference commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-commath-2023.201.0.0.3svn15878-53.1.noarch.rpm"
RPM_HASH = "696cd4f0fdee3880bd69c90f2fbf8d3425e1c90a72107df13be51423db5a42709f3768565f56fae340cee42f166ce2139f38aed7054a2a1178c11942f2a645fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commath.sty \
texlive-commath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
