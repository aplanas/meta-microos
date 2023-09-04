SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.20.7"

RPM_NAME = "go1.20-doc-1.20.7-1.1.aarch64.rpm"
RPM_HASH = "be8f37d367baa035f8039017aa930fb5a1c296d1a2fdcafa02e8e84255b699507869b99e034f0643d74f71b58a4bcc8143409353284d67155eb6288ea6770f5c"

RPROVIDES:${PN} += "go-doc \
go1.20-doc"

RDEPENDS:${PN} += ""

inherit rpm
