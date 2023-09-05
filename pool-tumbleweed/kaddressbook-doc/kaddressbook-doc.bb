SUMMARY = "Documentation for kaddressbook"
DESCRIPTION = "This package includes the user guide for KAddressbook in HTML format."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kaddressbook-doc-23.08.0-1.1.noarch.rpm"
RPM_HASH = "0ecc4120686d71e2977ccea8fcaf4d4462e84c2ea66c43a67a8f6f6878d5c0125241b21e0ad83ce1d7c6f6ad643988170c0b6c190d296638ccb6140aae351afa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaddressbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
