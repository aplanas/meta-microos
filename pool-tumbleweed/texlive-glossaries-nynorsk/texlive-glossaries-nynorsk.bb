SUMMARY = "Nynorsk language module for the glossaries package"
DESCRIPTION = "Norwegian Nynorsk language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-2023.201.1.0svn55189-53.1.noarch.rpm"
RPM_HASH = "4909d78c190f7cebec6900483df9c47bc222d7f1177b6680fa78f07d111e9dabc1399b97ee51bd499bd96ed74dcc0d9b1fcf5f30141d017cae52827d97413f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-nynorsk.ldf \
texlive-glossaries-nynorsk"

RDEPENDS:${PN} += "/bin/sh \
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
