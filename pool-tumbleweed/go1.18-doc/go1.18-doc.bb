SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-doc-1.18.10-4.1.aarch64.rpm"
RPM_HASH = "28cd3bc3dd8ce3c69ea6ebcf3815fa46b15977996370565a6294b77f25e3b7fccb5a7fa4f1f73463afe1dfd837bf5280fc26455a9ea258cf9d28c17f4f5acfd2"

RPROVIDES:${PN} += "go-doc \
go1.18-doc"

RDEPENDS:${PN} += ""

inherit rpm
