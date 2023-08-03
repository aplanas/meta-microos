SUMMARY = "Non-floating table and figure captions"
DESCRIPTION = "Adjusts the figure and table environments to ensure that \
centered objects as one line captions are centered as well. \
Also the vertical spaces for table captions above the table are \
changed."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn17598"

RPM_NAME = "texlive-nonfloat-2023.209.1.0svn17598-55.1.noarch.rpm"
RPM_HASH = "5e52f5d318f61320907061fee146f9931af22305104c189bf7d666b075be1c384369de0bf8e99ff7b26702af7474da617e9748602fe5b121789c9d90fec0fc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nonfloat.sty \
texlive-nonfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
