SUMMARY = "Documentation for texlive-emp"
DESCRIPTION = "This package includes the documentation for texlive-emp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn23483"

RPM_NAME = "texlive-emp-doc-2023.201.svn23483-53.1.noarch.rpm"
RPM_HASH = "4777347eb0d9012fb13782fcbf90c7c28bf1e9204586dbbd82250d6d9303aeef3cc184842abe996b09f2e09ccf1b85592cb4c05576e71ae5e231dcb2971ef612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emp-doc"

RDEPENDS:${PN} += ""

inherit rpm
