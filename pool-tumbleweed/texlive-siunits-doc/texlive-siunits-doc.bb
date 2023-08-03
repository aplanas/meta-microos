SUMMARY = "Documentation for texlive-siunits"
DESCRIPTION = "This package includes the documentation for texlive-siunits"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.36svn59702"

RPM_NAME = "texlive-siunits-doc-2023.209.1.36svn59702-58.1.noarch.rpm"
RPM_HASH = "aba4a5b182e5cfb3caaf9e8930bb3a6020302ea3ebcdbd197ac5e7d87404658b200987b511a0d458236ddb2a44c0b130c0f79dd8706a7f9c1da03049433997b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-siunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
