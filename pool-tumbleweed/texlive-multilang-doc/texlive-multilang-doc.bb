SUMMARY = "Documentation for texlive-multilang"
DESCRIPTION = "This package includes the documentation for texlive-multilang"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9bsvn49065"

RPM_NAME = "texlive-multilang-doc-2023.201.0.0.9bsvn49065-54.1.noarch.rpm"
RPM_HASH = "42aa0e0c4693b0d3589a36c4c7d5152a6b0be5a7e96c6225a668fff9fcd5cafe8f67f6addb4236cb900dbf6fae0fe0234987f30409cf5e43fa68e82a497964bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multilang-doc"

RDEPENDS:${PN} += ""

inherit rpm
