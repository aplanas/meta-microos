SUMMARY = "Documentation for texlive-substances"
DESCRIPTION = "This package includes the documentation for texlive-substances"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn40989"

RPM_NAME = "texlive-substances-doc-2023.209.0.0.2asvn40989-58.1.noarch.rpm"
RPM_HASH = "412a997c7072339f36ba25b5862721f98938f67543798459855b3d47dde016a8e73483c4112af62edee4a2f4d0c236efefbe76c97173e1e2c1eaf830a2a440d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substances-doc"

RDEPENDS:${PN} += ""

inherit rpm
