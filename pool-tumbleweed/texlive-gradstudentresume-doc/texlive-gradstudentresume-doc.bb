SUMMARY = "Documentation for texlive-gradstudentresume"
DESCRIPTION = "This package includes the documentation for texlive-gradstudentresume"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn38832"

RPM_NAME = "texlive-gradstudentresume-doc-2023.209.svn38832-54.1.noarch.rpm"
RPM_HASH = "d364208e7d8240b8139a44e6c64de9a619b850be1967ab073dbb0c5454b70aac5aa75895bcc07047776abae7b8318917492b65f4709b9caaca62d04cf4bdccbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradstudentresume-doc"

RDEPENDS:${PN} += ""

inherit rpm
