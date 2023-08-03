SUMMARY = "Babel support for Hungarian (Magyar)"
DESCRIPTION = "The package provides a language definition file that enables \
support of Magyar (Hungarian) with babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5csvn49701"

RPM_NAME = "texlive-babel-hungarian-2023.209.1.5csvn49701-54.1.noarch.rpm"
RPM_HASH = "0a4634a0da22e08c444337d44321730067ffbae732dffe5ae951f137a1ec0362ffd81eff3ba1d1c7ce0c3711fadeecc377f9d61f9ec3c050e6702b4efe1df2dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magyar.ldf \
texlive-babel-hungarian"

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
