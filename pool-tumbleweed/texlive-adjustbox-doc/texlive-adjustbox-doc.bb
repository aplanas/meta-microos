SUMMARY = "Documentation for texlive-adjustbox"
DESCRIPTION = "This package includes the documentation for texlive-adjustbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn64967"

RPM_NAME = "texlive-adjustbox-doc-2023.201.1.3asvn64967-54.1.noarch.rpm"
RPM_HASH = "5471a1c6183f8cf9000dd47ea2547794d96c25740cfb0c4f61b72a57bc38ca26c2cbec6d231e0a600955a076661712444e96e10d20f9eaaf9275f96b6b41b823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adjustbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
