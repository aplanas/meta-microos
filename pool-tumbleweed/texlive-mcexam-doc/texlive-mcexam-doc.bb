SUMMARY = "Documentation for texlive-mcexam"
DESCRIPTION = "This package includes the documentation for texlive-mcexam"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.5svn60481"

RPM_NAME = "texlive-mcexam-doc-2023.208.0.0.5svn60481-53.1.noarch.rpm"
RPM_HASH = "44f73154c6eb5a71531b7da273ae405f093129468a2c91427a5d498ec00b65b91e985a549bb067a1f5671e0ae488dc349452279fb542b23c862f1aaa96e0a931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
