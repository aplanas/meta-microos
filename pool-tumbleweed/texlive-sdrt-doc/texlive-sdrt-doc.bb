SUMMARY = "Documentation for texlive-sdrt"
DESCRIPTION = "This package includes the documentation for texlive-sdrt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-sdrt-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "8a4f060cc80a2df4f744c5a8cc82eb5418d3ec0ecdcb67f9705b101422dbfb7c02797059c483cf7d8868c271a0b17aaff449eca682c28ba4218b6d709ba5b19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sdrt-doc"

RDEPENDS:${PN} += ""

inherit rpm
