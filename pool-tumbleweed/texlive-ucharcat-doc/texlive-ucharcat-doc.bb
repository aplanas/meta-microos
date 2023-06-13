SUMMARY = "Documentation for texlive-ucharcat"
DESCRIPTION = "This package includes the documentation for texlive-ucharcat"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn38907"

RPM_NAME = "texlive-ucharcat-doc-2023.201.0.0.03svn38907-53.1.noarch.rpm"
RPM_HASH = "702284246eb8c3a30f7d984a57968f1b4db9bbb66ed624167fee18eabcfdb4ff3519510b5e76ad5cc0a9ddb66f184126a5b7617e60d63303d02dc013651179fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucharcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
