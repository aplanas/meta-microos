SUMMARY = "Left sub- and superscripts in maths mode"
DESCRIPTION = "The package enables left subscripts and superscripts in maths \
mode. The sub- and superscripts are raised for optimum fitting \
to the symbol indexed, in such a way that left and right sub- \
and superscripts are set on the same level, as appropriate. The \
package provides an alternative to the use of the \\sideset \
command in the amsmath package."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn32214"

RPM_NAME = "texlive-fouridx-2023.209.2.00svn32214-53.1.noarch.rpm"
RPM_HASH = "eb376fc138fa6c6824c772c9db2be8d6c206f1c971d9399f0425dbc18a1bcadd3c575c22439137faf5664b89a5d43d517a619377d365cc4c70a67bdd6cbfe4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fouridx.sty \
texlive-fouridx"

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
