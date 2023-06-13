SUMMARY = "Documentation for texlive-pangram"
DESCRIPTION = "This package includes the documentation for texlive-pangram"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0csvn66300"

RPM_NAME = "texlive-pangram-doc-2023.201.0.0.0csvn66300-51.1.noarch.rpm"
RPM_HASH = "6df23d7e62dcbb6f1aeee813a2c144307e42e8e1478c23e337b401583e10a70552214abc97499ae674f07802879f5da7baee35a5d5d8ee8b1bd298d5758ac014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pangram-doc"

RDEPENDS:${PN} += ""

inherit rpm
