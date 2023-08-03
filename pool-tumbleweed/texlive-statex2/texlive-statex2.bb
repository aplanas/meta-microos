SUMMARY = "Statistics style"
DESCRIPTION = "The package defines many macros for items of significance in \
statistical presentations. It represents a syntax-incompatible \
upgrade of statex."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn23961"

RPM_NAME = "texlive-statex2-2023.209.2.1svn23961-58.1.noarch.rpm"
RPM_HASH = "f2b10de36ff5c7eaa8bcc0bd96d32a3381f8f1b92b101c508485f88e77e411010198ffde2c992f76d780eee29fdb02a61de80b4e0a14347f797a84c6548e31cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statex2.sty \
texlive-statex2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-color.sty \
tex-ifthen.sty \
tex-shortvrb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
