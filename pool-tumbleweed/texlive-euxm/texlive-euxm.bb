SUMMARY = "Extended Euler by DEK"
DESCRIPTION = "Includes two additional characters needed for Concrete Math \
(ca. 1991)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-euxm-2023.201.svn54074-52.1.noarch.rpm"
RPM_HASH = "12a3651aba2a345c911b7552408206f61be269ec861fb72c12da11d9c3f4ca45fe8a5d1dd699cdf4535cdbdef692527534a7bf9f7857a8e8955fc72885b5248f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(euxm10.tfm) \
tex(euxm5.tfm) \
tex(euxm7.tfm) \
texlive-euxm"

RDEPENDS:${PN} += "/bin/sh \
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
