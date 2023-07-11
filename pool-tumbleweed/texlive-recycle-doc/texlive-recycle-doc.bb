SUMMARY = "Documentation for texlive-recycle"
DESCRIPTION = "This package includes the documentation for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-recycle-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "f9ddb1eb33a531baf63de4b935a0c042353a6b6a095be99e3535fd3934413110e7161e2a5834b7a3e1cce5b467ede745cdfd176c7b82e6abde85417afb904a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
