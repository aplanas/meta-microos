SUMMARY = "Support OpenType Spark fonts"
DESCRIPTION = "The package supports the free fonts from 'After the Flood' \
which are available from AtF Spark. The following fonts are \
supported: Spark -- Bar -- Medium Spark -- Bar -- Narrow Spark \
-- Bar -- Thin Spark -- Dot-line -- Medium Spark -- Dot -- \
Medium Spark -- Dot -- Small"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.05asvn62481"

RPM_NAME = "texlive-spark-otf-2023.201.0.0.05asvn62481-57.1.noarch.rpm"
RPM_HASH = "0bf0d02c5a76b0daefc4916a0e3dffaa3675c3fbf76a9cd59dc7283c41e41a6686ab8cfd0386d71c537ea4212d1a70bb45cd005847f42b43bcfb083b3435b21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spark-otf.sty) \
texlive-spark-otf"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(luacode.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-spark-otf-fonts"

inherit rpm
