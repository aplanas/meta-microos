SUMMARY = "Documentation for dynare in PDF format"
DESCRIPTION = "This package provides documentation for dynare in PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "5.4"

RPM_NAME = "dynare-doc-pdf-5.4-1.1.noarch.rpm"
RPM_HASH = "be3193ef3cf39010314cd877a85f636603be7d5a27819ba49c02c60af6e4a955a1ba4d1ae73c0a2e7102e1eb0f9f2962af6933c45f055742bb3af40b6ab6b030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynare-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
