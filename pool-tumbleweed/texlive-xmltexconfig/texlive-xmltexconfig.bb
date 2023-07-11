SUMMARY = "Configuration files for xmltex and pdfxmltex"
DESCRIPTION = "The xmltexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45845"

RPM_NAME = "texlive-xmltexconfig-2023.201.svn45845-52.2.noarch.rpm"
RPM_HASH = "32869c2f80fc7a988540e874990f9adb15efc4ff84318ed8f0b9cc125d03d6c58b06ec269c0d7731c8c1f230eff1ac70688280f7b3e84469cd1b6d7357895074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltexconfig"

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
