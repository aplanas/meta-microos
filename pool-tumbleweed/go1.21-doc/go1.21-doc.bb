SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "go1.21-doc-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "d6d7e00f0bc4aab89bd62b031c61c0901ab26afb28c26371a40daf6ba2742b2e118b06d4cc8bacd614c07f7f219c365b3953fa8fac5b7679e37ab099db059969"

RPROVIDES:${PN} += "go-doc \
go1.21-doc"

RDEPENDS:${PN} += ""

inherit rpm
