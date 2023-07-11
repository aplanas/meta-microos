SUMMARY = "Documentation for texlive-emulateapj"
DESCRIPTION = "This package includes the documentation for texlive-emulateapj"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28469"

RPM_NAME = "texlive-emulateapj-doc-2023.201.svn28469-53.2.noarch.rpm"
RPM_HASH = "ba885a558bd204246ab56aea4aa5622e9d2490ef8e56db81e040f3430bf1f912314b9e3e37ed179f17a5d555b9a6a23045204f1a4ec1e2fc1527ec1617369481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emulateapj-doc"

RDEPENDS:${PN} += ""

inherit rpm
