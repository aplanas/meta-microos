SUMMARY = "Documentation for texlive-bboldx"
DESCRIPTION = "This package includes the documentation for texlive-bboldx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.032svn65424"

RPM_NAME = "texlive-bboldx-doc-2023.201.1.032svn65424-53.1.noarch.rpm"
RPM_HASH = "ef80873159e2419bc03b09e6b47309fd39893140a3a98e6c87519b1ea2c874db02c6dd652dd40e2ec83e001912c7e344c7496c4c3df1109a0eac3dd418868a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bboldx-doc"
RDEPENDS:${PN} += ""

inherit rpm
