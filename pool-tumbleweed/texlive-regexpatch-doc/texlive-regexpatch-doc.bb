SUMMARY = "Documentation for texlive-regexpatch"
DESCRIPTION = "This package includes the documentation for texlive-regexpatch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2fsvn58668"

RPM_NAME = "texlive-regexpatch-doc-2023.201.0.0.2fsvn58668-53.1.noarch.rpm"
RPM_HASH = "e8730c71e629ca54db3d28416a957ae2e717e62b19ef03be9349a88f163aaedd71af840ef1d7d2e31b3be09d24dcd007c6f7a60a3aaf8f94deb8cf4c4b026fe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regexpatch-doc"

RDEPENDS:${PN} += ""

inherit rpm
