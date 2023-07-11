SUMMARY = "Documentation for texlive-regexpatch"
DESCRIPTION = "This package includes the documentation for texlive-regexpatch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-doc-2023.201.0.0.2fsvn58668-53.2.noarch.rpm"
RPM_HASH = "2fa5a29b324934fadf56a2b666171fd11bda3199d2715618cd621e67f03a4787d820ecb5397b8a24362580b9984e23e92a19290d1a8eaa727480e006f7fdb74b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regexpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
