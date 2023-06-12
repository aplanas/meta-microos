SUMMARY = "Documentation for switcheroo-control"
DESCRIPTION = "This package contains the documentation for switcheroo-control."
LICENSE = "GPL-3.0-only"

PV = "2.6"

RPM_NAME = "switcheroo-control-doc-2.6-1.4.noarch.rpm"
RPM_HASH = "e05ba7cbeef6b671e37fb7719d6b59fa4a9fcf8954cd99de32d55fe13ca21f2bbf09969d0bfcdbf5c02ab59a863b064ba8ade75bc1e702b12063e7f5d686966e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "switcheroo-control-doc"
RDEPENDS:${PN} += ""

inherit rpm
