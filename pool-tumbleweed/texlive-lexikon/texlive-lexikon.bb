SUMMARY = "Macros for a two language dictionary"
DESCRIPTION = "The lexikon package"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn17364"

RPM_NAME = "texlive-lexikon-2023.209.1.0csvn17364-55.1.noarch.rpm"
RPM_HASH = "eb4fda2c4ded06d9846fac632a03d9a25baf5c4895d32e92bb5da5c9963486c5f1be66a173aa311a0e0e10678812952d3d60835f975c593a473b8ca99304a81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lexikon.sty \
texlive-lexikon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
