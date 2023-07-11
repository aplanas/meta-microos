SUMMARY = "Development files for libvc"
DESCRIPTION = "Development files for libvc."
LICENSE = "LGPL-2.1-only"

PV = "012"

RPM_NAME = "libvc-devel-012-1.4.aarch64.rpm"
RPM_HASH = "301d9401a2f9446cef27b2688494d943adbf2a90a7ccc46fe90abcade8861a173d7b21b1dee142691f9bd676e813456de3232af6af8f4207a9ff69af947a45b2"

RPROVIDES:${PN} += "libvc-devel"

RDEPENDS:${PN} += "libvc0"

inherit rpm
