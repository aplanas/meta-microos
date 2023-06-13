SUMMARY = "Documentation for texlive-pdftricks"
DESCRIPTION = "This package includes the documentation for texlive-pdftricks"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.16svn15878"

RPM_NAME = "texlive-pdftricks-doc-2023.201.1.16svn15878-51.1.noarch.rpm"
RPM_HASH = "ee44feca6df5d14eb80bc1fc5d112fa44c89604cd860e9457472f5c6977f379050c4928135f55309d08d1185cb096f68816d2b3c4469ddbb1105e64c194fa532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
