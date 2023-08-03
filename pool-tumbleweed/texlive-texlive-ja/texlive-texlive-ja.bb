SUMMARY = "TeX Live manual (Japanese)"
DESCRIPTION = "The texlive-ja package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66482"

RPM_NAME = "texlive-texlive-ja-2023.209.svn66482-55.1.noarch.rpm"
RPM_HASH = "d3d67103cb7dee9da53238ccaf2cbca1b5099fd22af3c2db70971eaf7e004e6bbf3b0eb16b566333f504a0db92409640eed252d155f3f1aefbf1c9718eb637f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-ja"

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
