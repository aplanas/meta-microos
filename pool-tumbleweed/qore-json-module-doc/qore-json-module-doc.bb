SUMMARY = "JSON module for Qore"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
json module."
LICENSE = "MIT"

PV = "1.8.2"

RPM_NAME = "qore-json-module-doc-1.8.2-2.1.noarch.rpm"
RPM_HASH = "ff2e636b6ab2b9b456a01568a074f809ee3962550fd4ceb4de2c52a11739aaeba5ee0a67302fde8d44841b2570c2572e052b0dc0967bcd5848d1a7d2c78b88da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-json-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
