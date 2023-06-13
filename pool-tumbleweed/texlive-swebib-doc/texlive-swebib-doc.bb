SUMMARY = "Documentation for texlive-swebib"
DESCRIPTION = "This package includes the documentation for texlive-swebib"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-swebib-doc-2023.201.svn15878-57.1.noarch.rpm"
RPM_HASH = "193c739b5cc2c0c97fff29d289f48327cc6ff00d1e3715a1bcf30275cca72221be4a6f6c645f4b68570d7abadcf8fe7c072fa7be46890b50b4d337793f17a86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
