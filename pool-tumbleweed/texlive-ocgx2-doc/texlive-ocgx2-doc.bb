SUMMARY = "Documentation for texlive-ocgx2"
DESCRIPTION = "This package includes the documentation for texlive-ocgx2"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.56svn65292"

RPM_NAME = "texlive-ocgx2-doc-2023.209.0.0.56svn65292-55.1.noarch.rpm"
RPM_HASH = "90a34fae5fc2dc12d472104d65c674c4d0004d6e094501b0d4ba18de3fb4f50972c79c3a4616bf87f6b495db48aa0c79e9ec843b643fddfe903cae6bcf948ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocgx2-doc"

RDEPENDS:${PN} += ""

inherit rpm
