SUMMARY = "Writing a TeX length with a space between number and unit"
DESCRIPTION = "Writing a TeX length with \\the writes the value and the unit \
without a space. Package isopt provides a macro \\ISO which \
inserts a user defined space between number and unit."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn45509"

RPM_NAME = "texlive-isopt-2023.209.0.0.01svn45509-56.1.noarch.rpm"
RPM_HASH = "1e1e787aa78cfd17005da8d9b71acac6fd2248e935d1f385188f62294ed58512c56db34583e0af4ce3f72e5b1f7a714a0d0f103883729a70fae4c50b11a8d95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isopt.sty \
texlive-isopt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
