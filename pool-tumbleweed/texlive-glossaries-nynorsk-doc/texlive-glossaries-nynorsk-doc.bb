SUMMARY = "Documentation for texlive-glossaries-nynorsk"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-nynorsk"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-doc-2023.209.1.0svn55189-54.1.noarch.rpm"
RPM_HASH = "c415b763263e6b5b283ba3dcada9be453a95c292424cc2c6b42f65aa04fdc8f353fa7e451d6009e3f802f18631f0847d2acce778132a96c823ba14935615294a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-nynorsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
