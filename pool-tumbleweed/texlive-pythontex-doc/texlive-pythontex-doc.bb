SUMMARY = "Documentation for texlive-pythontex"
DESCRIPTION = "This package includes the documentation for texlive-pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn59514"

RPM_NAME = "texlive-pythontex-doc-2023.201.0.0.18svn59514-53.2.noarch.rpm"
RPM_HASH = "65e296e708c19dfdd17c4841ee0ce1f87b50d9736a87226cdabb79ff3cf91830fafd7f0aa1b95e74721f34bb62b5e3a7473bb334985e01dfdf46b3de7792b00f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythontex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
