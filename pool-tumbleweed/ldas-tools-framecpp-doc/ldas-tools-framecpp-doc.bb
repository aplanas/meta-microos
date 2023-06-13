SUMMARY = "HTML documentation for ldas-tools-framecpp API"
DESCRIPTION = "This package provides the API documentation for ldas-tools-framecpp in HTML format."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-doc-2.7.0-2.12.noarch.rpm"
RPM_HASH = "5291b1c232f90bd9eae2f20a524f204dbf9dda3f1be33dd0a2ad44abe55cafe10aedd75ad9258a1c89f6a96c966f8ecae2c4a3b00c2e52876e96f679a20f9901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ldas-tools-framecpp-doc"

RDEPENDS:${PN} += ""

inherit rpm
