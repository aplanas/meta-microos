SUMMARY = "Generate logarithmic graph paper with LaTeX"
DESCRIPTION = "The logpap package provides four macros for drawing \
logarithmic-logarithmic, logarithmic-linear, linear-logarithmic \
and (because it was easy to implement) linear-linear graph \
paper with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-logpap-2023.209.0.0.6svn15878-55.1.noarch.rpm"
RPM_HASH = "df6bed05c322b49d44d3205a74051ebbfd2614c45e3f37f84451ecc74bed6accfd58f6a0e37ef75a24278566973790f99c0884c73eebe6e60bd4888b63d48f2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logpap.sty \
texlive-logpap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
