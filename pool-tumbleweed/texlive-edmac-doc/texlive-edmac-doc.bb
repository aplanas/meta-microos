SUMMARY = "Documentation for texlive-edmac"
DESCRIPTION = "This package includes the documentation for texlive-edmac"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.17svn61719"

RPM_NAME = "texlive-edmac-doc-2023.201.3.17svn61719-53.1.noarch.rpm"
RPM_HASH = "17cabd07018d9a2d986889f84011e0bb58f94732556d9604d92e9e87f7493ce62d4e73b9705408f5381ee43c2e629863c73b143016df3f07217ed703e592a0ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
