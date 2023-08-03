SUMMARY = "Documentation for texlive-docmfp"
DESCRIPTION = "This package includes the documentation for texlive-docmfp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2dsvn15878"

RPM_NAME = "texlive-docmfp-doc-2023.209.1.2dsvn15878-53.1.noarch.rpm"
RPM_HASH = "3a8a6d926501ba58f6af5f20b5e128a09658cb655283417d315d28077bb4f3c1694410e5f5c8750dbac1b57edc10fb30eb2b154041b4f35f906493e6f1edc0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docmfp-doc"

RDEPENDS:${PN} += ""

inherit rpm
