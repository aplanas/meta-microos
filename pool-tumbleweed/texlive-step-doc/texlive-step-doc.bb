SUMMARY = "Documentation for texlive-step"
DESCRIPTION = "This package includes the documentation for texlive-step"
LICENSE = "OFL-1.1"

PV = "2023.201.2.0.5svn57307"

RPM_NAME = "texlive-step-doc-2023.201.2.0.5svn57307-57.1.noarch.rpm"
RPM_HASH = "56b3c60126cf3e4a7c366f284e4998a2c9a63f4bc8c89be3877cfa4731cb92b4045eef3ee29bbfadf782bac72c49ba15f4e9ee4f1bd09ba6de07fc338f836852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-step-doc"
RDEPENDS:${PN} += ""

inherit rpm
