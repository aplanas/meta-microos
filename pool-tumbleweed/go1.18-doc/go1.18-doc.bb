SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-doc-1.18.10-4.2.aarch64.rpm"
RPM_HASH = "9ee1c9ac6f8b3070bbcef6c5137b8cc942eee8007a2d0dcd26a33e7654e6bdcca17c41de610b6c5fc2806404c125fa6aa0e18f1b0d273675a3f01cfe71a46cef"

RPROVIDES:${PN} += "go-doc \
go1.18-doc"

RDEPENDS:${PN} += ""

inherit rpm
