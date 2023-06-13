SUMMARY = "Documentation for texlive-hrefhide"
DESCRIPTION = "This package includes the documentation for texlive-hrefhide"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn66189"

RPM_NAME = "texlive-hrefhide-doc-2023.201.1.1asvn66189-53.1.noarch.rpm"
RPM_HASH = "c87c242164b6642fa267574f77397c09ef9174a1d26882b6bb8e3b312f858d818f8480b0480585504eb1a6b452fc574f1612901d80b45ca380bd27883f15c006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hrefhide-doc"

RDEPENDS:${PN} += ""

inherit rpm
