SUMMARY = "Documentation for texlive-eqnnumwarn"
DESCRIPTION = "This package includes the documentation for texlive-eqnnumwarn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-doc-2023.201.1.0svn45511-53.2.noarch.rpm"
RPM_HASH = "cbce4729090f3a7fab8674bdbe9d9ee8809b9082010d74a68bc9dbb46bf0bb668ccaaec51132be1b256b0f6231699c89c8138258c8ac6821671393984f67d748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnnumwarn-doc"

RDEPENDS:${PN} += ""

inherit rpm
