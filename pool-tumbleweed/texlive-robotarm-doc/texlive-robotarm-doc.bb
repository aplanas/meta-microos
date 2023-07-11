SUMMARY = "Documentation for texlive-robotarm"
DESCRIPTION = "This package includes the documentation for texlive-robotarm"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn63116"

RPM_NAME = "texlive-robotarm-doc-2023.201.0.0.1svn63116-53.2.noarch.rpm"
RPM_HASH = "8868105b3377d8c1dbba3b6997d784f1cb63f37e5b1464785e585856356f62d945cfef7be328ac2cea30d7aa5c4e5b43b27f669e0565362e2184a7eb2558f5eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-robotarm-doc"

RDEPENDS:${PN} += ""

inherit rpm
