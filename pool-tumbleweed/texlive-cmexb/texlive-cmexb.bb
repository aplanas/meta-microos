SUMMARY = "Cmexb10 metrics and Type 1"
DESCRIPTION = "Computer Modern Math Extension bold, metrics and .pfb file. \
Made by Petr Olsak via autotracing."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-cmexb-2023.209.svn54074-54.1.noarch.rpm"
RPM_HASH = "561be528dbe8978f5b15be2b45c51daf18aab1e2cb167b4cbd7baefd755f5ac135093ec7f97b63aa6dda342504e37dea01f8862fd66800c70d236c7213a67908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmexb.map \
tex-cmexb10.tfm \
texlive-cmexb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cmexb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
