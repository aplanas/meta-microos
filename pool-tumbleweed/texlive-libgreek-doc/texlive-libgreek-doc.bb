SUMMARY = "Documentation for texlive-libgreek"
DESCRIPTION = "This package includes the documentation for texlive-libgreek"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65004"

RPM_NAME = "texlive-libgreek-doc-2023.209.1.1svn65004-55.1.noarch.rpm"
RPM_HASH = "9dbd32d98b61036cd3bdf3325dc06044d21e99a79b3918889819e90960f4663b7d68e93e154dc317fd7492344aae71c34a802d8b52acd665fb39e945ff3be021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
