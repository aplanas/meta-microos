SUMMARY = "Documentation for WTForms"
DESCRIPTION = "Documentation for WTForms, which is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python-WTForms-doc-3.0.1-2.6.noarch.rpm"
RPM_HASH = "5363074e4fbd3f9c1707ec2511f5c8f419aa837b5615a8b90e5a44aa6ac84f516e20c97f1d2aae276f396db9a20a3c2d7e88c5779ee001182828b5bb7cd9e324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WTForms-doc"

RDEPENDS:${PN} += ""

inherit rpm
