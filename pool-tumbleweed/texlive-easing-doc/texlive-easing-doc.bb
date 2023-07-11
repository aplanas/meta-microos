SUMMARY = "Documentation for texlive-easing"
DESCRIPTION = "This package includes the documentation for texlive-easing"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn59975"

RPM_NAME = "texlive-easing-doc-2023.201.0.0.1svn59975-53.2.noarch.rpm"
RPM_HASH = "91d8b3029c95d61f0e8ee6a3a205b3e3fc2a8007b4ab41c47f07b6edbf5307c85456fcd56db9a7ed5679d63527da115405662b3f2e71678ebb669f1916ece07b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easing-doc"

RDEPENDS:${PN} += ""

inherit rpm
