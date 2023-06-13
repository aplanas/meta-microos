SUMMARY = "Documentation for texlive-biblatex-bookinother"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bookinother"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.3svn54015"

RPM_NAME = "texlive-biblatex-bookinother-doc-2023.201.2.3.3svn54015-53.1.noarch.rpm"
RPM_HASH = "5f349338dd85e7b902c5b6b21034eeccf0ba60ff0f8ba0ed5dbedc077378dd453fc3a3f242215b4d1f228fb6fbee2c682e05d5540a950e258aff2a860f2e3fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bookinother-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
