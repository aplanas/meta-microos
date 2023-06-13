SUMMARY = "Documentation for texlive-footnpag"
DESCRIPTION = "This package includes the documentation for texlive-footnpag"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-footnpag-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "b1d8b4624ef39e732ac676167ec15ed6ca1f785a0c27df595523b0e72f91d2df754ff48bb8a2ab7df461962d8bf31ef409eff5834f9b278fb5324bff41be6b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnpag-doc"

RDEPENDS:${PN} += ""

inherit rpm
