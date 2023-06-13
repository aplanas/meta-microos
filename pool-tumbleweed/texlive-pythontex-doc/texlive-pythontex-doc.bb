SUMMARY = "Documentation for texlive-pythontex"
DESCRIPTION = "This package includes the documentation for texlive-pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn59514"

RPM_NAME = "texlive-pythontex-doc-2023.201.0.0.18svn59514-53.1.noarch.rpm"
RPM_HASH = "4357ba03fc18a334909a8883bd9db549a43a32d452c7da589eb9202f52b35fb32df2da39f098758edf6a26f26ea624651da3967e4272b3de84ad6684a7ba3629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythontex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
