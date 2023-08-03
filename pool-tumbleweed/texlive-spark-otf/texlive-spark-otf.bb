SUMMARY = "Support OpenType Spark fonts"
DESCRIPTION = "The package supports the free fonts from 'After the Flood' \
which are available from AtF Spark. The following fonts are \
supported: Spark -- Bar -- Medium Spark -- Bar -- Narrow Spark \
-- Bar -- Thin Spark -- Dot-line -- Medium Spark -- Dot -- \
Medium Spark -- Dot -- Small"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.05asvn62481"

RPM_NAME = "texlive-spark-otf-2023.209.0.0.05asvn62481-58.1.noarch.rpm"
RPM_HASH = "ee1d587328ce25a2cae25eed88188ea4c6f69d2110e62b11e3e894d607b529d42e50e3aa71acd127e18f3bfd39069b5507320e882f595371db356ffcc1f40a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spark-otf.sty \
texlive-spark-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-luacode.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-spark-otf-fonts"

inherit rpm
