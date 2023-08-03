SUMMARY = "Creates a template for a self-extracting .dtx file"
DESCRIPTION = "The bash script dtxgen creates a template for a self-extracting \
.dtx file. It is useful for those who plan to create a new \
Documented LaTeX Source (.dtx) file."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.08svn51663"

RPM_NAME = "texlive-dtxgen-2023.209.1.08svn51663-53.1.noarch.rpm"
RPM_HASH = "8ce4cf65c5177edfca9592c62bc9da05643430c242e5badede09a4f042ea4d049a58b164e6975cf940b3ecf8895a354b0b2164da073cc3f773f65011b7ffb80a"
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
