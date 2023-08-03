SUMMARY = "Documentation for texlive-rcs-multi"
DESCRIPTION = "This package includes the documentation for texlive-rcs-multi"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn64967"

RPM_NAME = "texlive-rcs-multi-doc-2023.209.0.0.1asvn64967-54.1.noarch.rpm"
RPM_HASH = "9dd9790de8783a8b85b5f9326164c64e357902b3a9ee916fbc530acb40677093ca22dd1c9d86967e56b8cc7d37c5472539ec1310943553bc5f6237c7bf8867ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
