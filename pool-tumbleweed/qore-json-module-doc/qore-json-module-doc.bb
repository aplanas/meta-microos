SUMMARY = "JSON module for Qore"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
json module."
LICENSE = "MIT"

PV = "1.8.2"

RPM_NAME = "qore-json-module-doc-1.8.2-1.2.noarch.rpm"
RPM_HASH = "b665cede1fb9e40c6ef4183b67bd0536e5ae36229e9f3f3132c8d66b520cb9f2ded6776c9897913800bbc77f63e16827939b8150c07a350b71343b2ea2642ca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-json-module-doc"
RDEPENDS:${PN} += ""

inherit rpm
