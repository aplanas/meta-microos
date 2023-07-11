SUMMARY = "Documentation for texlive-rccol"
DESCRIPTION = "This package includes the documentation for texlive-rccol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2csvn15878"

RPM_NAME = "texlive-rccol-doc-2023.201.1.2csvn15878-53.2.noarch.rpm"
RPM_HASH = "93202857271f888bebcdabf4e5951ffab0aebee041a1a6ecc888e1bfcc235d3cd335dd2b7ad5f3f0a9d6509d7634fcc188008498f478a59ebc7a01940247c8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rccol-doc"

RDEPENDS:${PN} += ""

inherit rpm
