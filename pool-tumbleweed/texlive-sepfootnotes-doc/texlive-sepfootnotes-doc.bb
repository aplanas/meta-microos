SUMMARY = "Documentation for texlive-sepfootnotes"
DESCRIPTION = "This package includes the documentation for texlive-sepfootnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3csvn41732"

RPM_NAME = "texlive-sepfootnotes-doc-2023.201.0.0.3csvn41732-53.1.noarch.rpm"
RPM_HASH = "b59d7b1076fae3a02c2a6d0ed414295a79838f1a5b52d12534fd9bfad7a120a314e59e397f4d4f56517423775195a3036edc370571bd5da2cb0e0a12f694619b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sepfootnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
