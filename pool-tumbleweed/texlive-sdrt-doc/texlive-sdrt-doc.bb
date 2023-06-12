SUMMARY = "Documentation for texlive-sdrt"
DESCRIPTION = "This package includes the documentation for texlive-sdrt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-sdrt-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "9a1ecec8ac5c237db2cdb68c7c2b15def19680efefd52f3573ce8822869915483041cfbd6534b83bfea17a276593c4f1f75d71ba7a9665c0412fe4962a7049cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sdrt-doc"
RDEPENDS:${PN} += ""

inherit rpm
