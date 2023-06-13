SUMMARY = "Documentation for texlive-gmdoc"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-doc-2023.201.0.0.993svn21292-53.1.noarch.rpm"
RPM_HASH = "4b164962efd8b7db3cfcbf6e85d971ce898321cc0965b001ba780add64c9db3d4a0e59e8f840ae7668b9eb643b6260488d3a57e71ac0b48fa9c649111e7140ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
