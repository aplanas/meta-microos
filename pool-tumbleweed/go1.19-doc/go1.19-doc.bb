SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.19.11"

RPM_NAME = "go1.19-doc-1.19.11-1.1.aarch64.rpm"
RPM_HASH = "0d8312cfd102ebe98f86f314b8604a38a898dd37881f583474aeaeaef25f06d472dde57ddff262df9a4fc0062dd1e2e589801390ef5192ccead9f1ea33e199e0"

RPROVIDES:${PN} += "go-doc \
go1.19-doc"

RDEPENDS:${PN} += ""

inherit rpm
