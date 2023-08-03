SUMMARY = "Documentation for texlive-babel-breton"
DESCRIPTION = "This package includes the documentation for texlive-babel-breton"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn30257"

RPM_NAME = "texlive-babel-breton-doc-2023.209.1.0hsvn30257-54.1.noarch.rpm"
RPM_HASH = "d6f2352278bf0d9f557b1e4d0bc40fe2f8d6bbf67f15a4497fa98996664e1afaa62f37dd203864de3314a647ce2f6cf73b556fd4c3d0b452188f828e5ec8dc55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-breton-doc"

RDEPENDS:${PN} += ""

inherit rpm
