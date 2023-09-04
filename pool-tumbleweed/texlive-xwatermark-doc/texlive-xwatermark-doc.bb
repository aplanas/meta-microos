SUMMARY = "Documentation for texlive-xwatermark"
DESCRIPTION = "This package includes the documentation for texlive-xwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-doc-2023.209.1.5.2dsvn61719-53.2.noarch.rpm"
RPM_HASH = "55e312fd00aac151d102aafba2f41cea3e536790c61be9ddea200a9525361cea3e9c90277dde719d3ae07dbdc938b4f9490f3a3063455c45730e68b55310deaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
