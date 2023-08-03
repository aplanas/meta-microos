SUMMARY = "A short tutorial on using tlmgr in Chinese"
DESCRIPTION = "This is a Chinese translation of the tlmgr documentation. It \
introduces some of the common usage of the TeX Live Manager. \
The original can be found in the tlmgrbasics package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn59100"

RPM_NAME = "texlive-tlmgr-intro-zh-cn-2023.209.svn59100-53.1.noarch.rpm"
RPM_HASH = "6726b43a1e008c0dc116316ce4da854b94a0c1c6670e2367b07b637464abec9b01b5d4ecd4fd576190634e98c6edababedffac26b3c673033a6b7b598cc48124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlmgr-intro-zh-cn"

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
