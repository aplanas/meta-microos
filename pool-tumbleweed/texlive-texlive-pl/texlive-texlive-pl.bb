SUMMARY = "TeX Live manual (Polish)"
DESCRIPTION = "The texlive-pl package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66576"

RPM_NAME = "texlive-texlive-pl-2023.201.svn66576-54.1.noarch.rpm"
RPM_HASH = "23da6a8f3100cd5e81d9d8e51b1f4d6447c814d780b227207544de6351adf6dac3804a218e271c48365318cf9cd34353ba8160c94d70c4490d90071afe2593f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-pl"

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
