SUMMARY = "Documentation for texlive-enotez"
DESCRIPTION = "This package includes the documentation for texlive-enotez"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-doc-2023.201.0.0.10dsvn61490-53.1.noarch.rpm"
RPM_HASH = "d6b9d2c922db2088c8ecb67e5637a048eee286cd5a80d652ec959f05afa096b33b41b7650b85eb0fa0292f1504beed3fa23bcdf2ae49be3c40a37353196166c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enotez-doc"

RDEPENDS:${PN} += ""

inherit rpm
