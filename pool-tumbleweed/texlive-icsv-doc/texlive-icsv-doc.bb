SUMMARY = "Documentation for texlive-icsv"
DESCRIPTION = "This package includes the documentation for texlive-icsv"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn15878"

RPM_NAME = "texlive-icsv-doc-2023.208.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "34218246d9047a0d5e3172dc6f07a77bb75dd1cb057f8e01192e36c7723687144dbca23a76012939a20cd95d3b75b656675dfd63a62789b05f3274c7462bef22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icsv-doc"

RDEPENDS:${PN} += ""

inherit rpm
