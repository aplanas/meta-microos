SUMMARY = "Documentation for texlive-guitar"
DESCRIPTION = "This package includes the documentation for texlive-guitar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn32258"

RPM_NAME = "texlive-guitar-doc-2023.201.1.6svn32258-53.2.noarch.rpm"
RPM_HASH = "79b32ee24d0f21f4dba0fb13713d078884313bf687c1ba345ffbba8a03da72d0fcd5d7c5b8e5a85b4d3eebed50a360ccca5ee688bccd8ab77e78a76fb7edc87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitar-doc"

RDEPENDS:${PN} += ""

inherit rpm
