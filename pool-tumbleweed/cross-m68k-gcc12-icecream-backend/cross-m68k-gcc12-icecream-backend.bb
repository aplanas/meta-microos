SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-m68k-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "44c378903cfdc8eb4162018be08104c4ce384c1e29c2b89e7f763f6ac113ee3624c788e8986ca613934ce47b9089dbf68853424d4d073c6ae4dfc500afe167ec"

RPROVIDES:${PN} += "cross-m68k-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
