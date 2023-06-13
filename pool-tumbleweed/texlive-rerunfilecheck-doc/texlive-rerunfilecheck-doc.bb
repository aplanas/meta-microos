SUMMARY = "Documentation for texlive-rerunfilecheck"
DESCRIPTION = "This package includes the documentation for texlive-rerunfilecheck"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn63869"

RPM_NAME = "texlive-rerunfilecheck-doc-2023.201.1.10svn63869-53.1.noarch.rpm"
RPM_HASH = "e95525a99a21ce3999323fa32ae864c5f7eb9cfd2e8e8adf69f8043af7a170f218b8abd3f4a1d4a14b918054644d709e9e6e7f9f86e4dc365ab3b006589fb91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rerunfilecheck-doc"

RDEPENDS:${PN} += ""

inherit rpm
