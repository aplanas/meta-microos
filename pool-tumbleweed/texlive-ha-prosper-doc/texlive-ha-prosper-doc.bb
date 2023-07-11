SUMMARY = "Documentation for texlive-ha-prosper"
DESCRIPTION = "This package includes the documentation for texlive-ha-prosper"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-doc-2023.201.4.21svn59651-53.2.noarch.rpm"
RPM_HASH = "35392eafccb815c8f567a102d6febf96d4daba554391a50c84929c01605dc49bf6b3ebe262e3a0f04b9d031acbecf9255cc6feece68ee8f5f2882fa775bf72dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ha-prosper-doc"

RDEPENDS:${PN} += ""

inherit rpm
