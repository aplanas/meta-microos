SUMMARY = "Documentation for texlive-sidenotes"
DESCRIPTION = "This package includes the documentation for texlive-sidenotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00asvn54524"

RPM_NAME = "texlive-sidenotes-doc-2023.201.1.00asvn54524-53.1.noarch.rpm"
RPM_HASH = "424577ed843a8953bef5f5f4b28c17309e6476459b4c8f78ee8582026d815115e1ceb2917e6af130ba92a7bfa11125b94e3ca6539278776f9dd976970d892124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidenotes-doc"
RDEPENDS:${PN} += ""

inherit rpm
