SUMMARY = "Documentation for texlive-tex4ebook"
DESCRIPTION = "This package includes the documentation for texlive-tex4ebook"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3isvn66332"

RPM_NAME = "texlive-tex4ebook-doc-2023.201.0.0.3isvn66332-54.1.noarch.rpm"
RPM_HASH = "3caa63645cedd48157c5b01b81bdeec7e0bd14b6d9372cbd8792543d6aefa4bbe35f68662521adb7ea396a70443e45b62361e9338090d5e29f5a1fbbded3dde7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex4ebook-doc"
RDEPENDS:${PN} += ""

inherit rpm
