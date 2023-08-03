SUMMARY = "Documentation for texlive-tabularray"
DESCRIPTION = "This package includes the documentation for texlive-tabularray"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023asvn66276"

RPM_NAME = "texlive-tabularray-doc-2023.209.2023asvn66276-55.1.noarch.rpm"
RPM_HASH = "4789daf568ce2d4f181bf9cfff9dfd90e063b8a96c6a643d5fd99eb01de407d7e5c7857827a66de36bb87078653443692f18553b0defe3a630a27f001e843ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularray-doc"

RDEPENDS:${PN} += ""

inherit rpm
