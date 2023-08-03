SUMMARY = "Documentation for texlive-datetime2-irish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-irish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47632"

RPM_NAME = "texlive-datetime2-irish-doc-2023.209.1.1svn47632-53.1.noarch.rpm"
RPM_HASH = "293929dc43b0a2c445bccbcb36cb99693b5a654ad8f58d31dde02ef5ac939824b906f27f25900f89c4d8a6bb1619a6dfe6eae98442ad117760a3ec3cc2bb88f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
