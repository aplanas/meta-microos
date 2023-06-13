SUMMARY = "Documentation for texlive-hmtrump"
DESCRIPTION = "This package includes the documentation for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-doc-2023.201.1.2asvn54512-53.1.noarch.rpm"
RPM_HASH = "b91d6c635d74efd074f70b6569bba9ecad4b3c8c2b76b5dfa63e0d40d8d75938739cd934678fe83bf6b0d63e8e929fcecf789bd0d97bec4b02d6088d136c0c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hmtrump-doc:ja) \
texlive-hmtrump-doc"

RDEPENDS:${PN} += ""

inherit rpm
