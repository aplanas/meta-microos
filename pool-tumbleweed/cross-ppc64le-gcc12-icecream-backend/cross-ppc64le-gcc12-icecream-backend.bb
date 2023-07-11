SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-ppc64le-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "9ae082240ceb147a408a94393625ce2f3dc68f9972474fb875d63046ee6c17a4e18c10438e767a69860e9f37ff336e199afcfa2350bf7748e2b5b0ca450608df"

RPROVIDES:${PN} += "cross-ppc64le-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
