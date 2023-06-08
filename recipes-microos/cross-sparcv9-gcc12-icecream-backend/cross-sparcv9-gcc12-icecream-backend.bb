SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-sparcv9-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "e2995856cec493e02e06be17e578d4ebb7679b068242d485bb703372f26e571d8c0168c055002a5da88be1ecdce5f156b730de93845be3012a9b1970e1ae28cf"

RPROVIDES:${PN} += "cross-sparcv9-gcc12-icecream-backend cross-sparcv9-gcc12-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
