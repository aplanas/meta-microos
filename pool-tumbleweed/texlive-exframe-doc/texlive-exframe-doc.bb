SUMMARY = "Documentation for texlive-exframe"
DESCRIPTION = "This package includes the documentation for texlive-exframe"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn53911"

RPM_NAME = "texlive-exframe-doc-2023.209.3.4svn53911-53.1.noarch.rpm"
RPM_HASH = "42f2ece519a61bc8b3806ab439ca6041b3400d65289f04d37b49b58ec160e35875f1916c061e8a5af3ab289a128ed8b93dd79b8d0a6c27b133f0e576d8b0d0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
