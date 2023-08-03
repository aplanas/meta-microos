SUMMARY = "Macros for making newsletters with Plain TeX"
DESCRIPTION = "The newsletr package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-newsletr-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "9f1b6f94cf9b046df91799ab4f4a82bbb689b4e822667fecf129d6eef9a823cb6b523d595d4f9e5a71dfb8b69defed8cbb580613da80cf2b1784a64bbdf3839c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newsletr.tex \
texlive-newsletr"

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
