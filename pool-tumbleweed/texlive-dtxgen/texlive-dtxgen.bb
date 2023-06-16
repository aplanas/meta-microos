SUMMARY = "Creates a template for a self-extracting .dtx file"
DESCRIPTION = "The bash script dtxgen creates a template for a self-extracting \
.dtx file. It is useful for those who plan to create a new \
Documented LaTeX Source (.dtx) file."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.08svn51663"

RPM_NAME = "texlive-dtxgen-2023.201.1.08svn51663-52.1.noarch.rpm"
RPM_HASH = "ed166c8a11b80d9e6f92d082d38455e782807f120c56140b086c65a27fbaa48ecfdc0d3f25cbaebb671f28e4fd88cee26e511f508a8b26b0729bbf3d2c713ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxgen"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dtxgen-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
