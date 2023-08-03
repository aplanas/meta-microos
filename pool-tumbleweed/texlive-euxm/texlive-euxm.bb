SUMMARY = "Extended Euler by DEK"
DESCRIPTION = "Includes two additional characters needed for Concrete Math \
(ca. 1991)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-euxm-2023.209.svn54074-53.1.noarch.rpm"
RPM_HASH = "92c564faa74ff88226efd0be6c3ae9d04f0e162c332af1235fc22bcb93a14f4b9ae0d9a05e44bbca0dd0857061a71690d8233236699c0278d299427e3cec0dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euxm10.tfm \
tex-euxm5.tfm \
tex-euxm7.tfm \
texlive-euxm"

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
