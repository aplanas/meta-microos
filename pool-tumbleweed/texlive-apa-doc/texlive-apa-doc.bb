SUMMARY = "Documentation for texlive-apa"
DESCRIPTION = "This package includes the documentation for texlive-apa"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.4svn54080"

RPM_NAME = "texlive-apa-doc-2023.209.1.3.4svn54080-55.1.noarch.rpm"
RPM_HASH = "b8a87fcab07d6c420beb3f668098aa067f91f00acf1ee9b8e4ae175f228a68f9be4bb82a513b36e7a4356b18343acbf6ef8cf6f5c7d5562f7c4955861b2d6f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa-doc"

RDEPENDS:${PN} += ""

inherit rpm
