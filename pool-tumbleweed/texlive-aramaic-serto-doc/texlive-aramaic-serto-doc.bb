SUMMARY = "Documentation for texlive-aramaic-serto"
DESCRIPTION = "This package includes the documentation for texlive-aramaic-serto"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30042"

RPM_NAME = "texlive-aramaic-serto-doc-2023.201.1.0svn30042-54.1.noarch.rpm"
RPM_HASH = "ecfcb9fc60379e0dc465b477ca1ca1757942e76fc9bccc7f6ae82a64908abaef2a086a08c4179d184842ed84066404f00561bc3e3638c391c21538147a8f8727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aramaic-serto-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
