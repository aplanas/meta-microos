SUMMARY = "Documentation for texlive-datetime2-magyar"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-magyar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48266"

RPM_NAME = "texlive-datetime2-magyar-doc-2023.201.1.1svn48266-52.1.noarch.rpm"
RPM_HASH = "927878fca1be751d05f37740c9653c0f975b30fa2c25998c240bf961a636617247ae20f3ad1897a5769f9a928bb2ae5ed8005c3628133c915638d1c07f581954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-magyar-doc"
RDEPENDS:${PN} += ""

inherit rpm
