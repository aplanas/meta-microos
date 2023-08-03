SUMMARY = "Documentation for texlive-eemeir"
DESCRIPTION = "This package includes the documentation for texlive-eemeir"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-doc-2023.209.1.1bsvn15878-54.1.noarch.rpm"
RPM_HASH = "7aad0551edd96c2c31c0914258152ef9aa5e6e1335c9119e0b3ad2d5cf8de23d8c55b1f47e420666b2f2811464bdb0d564764c090065191b2903cd144d283414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eemeir-doc"

RDEPENDS:${PN} += ""

inherit rpm
