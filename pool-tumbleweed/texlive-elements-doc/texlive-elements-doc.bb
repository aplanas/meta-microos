SUMMARY = "Documentation for texlive-elements"
DESCRIPTION = "This package includes the documentation for texlive-elements"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn61792"

RPM_NAME = "texlive-elements-doc-2023.209.0.0.4svn61792-54.2.noarch.rpm"
RPM_HASH = "a0a0344befcc159cc0de614886b6f62226351ce79dc95a27740399feea0482aaad1d59b12f6c52861b5acd74f6d1d16c60d31a3a8b8e22da5fc6f9d4d147fc2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elements-doc"

RDEPENDS:${PN} += ""

inherit rpm
