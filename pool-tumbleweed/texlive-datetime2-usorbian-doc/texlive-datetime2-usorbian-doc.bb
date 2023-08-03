SUMMARY = "Documentation for texlive-datetime2-usorbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-usorbian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52375"

RPM_NAME = "texlive-datetime2-usorbian-doc-2023.209.1.1svn52375-53.1.noarch.rpm"
RPM_HASH = "28b1c1f3fa37ceac97d5544513c01f9492f210e39f7981c1b46f9f140812a0cbf103bce1c916667f271437cf88d0f960bd50d14e1abeeaa27de5680b893a5110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-usorbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
