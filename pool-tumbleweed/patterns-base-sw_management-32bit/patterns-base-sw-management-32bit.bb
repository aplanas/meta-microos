SUMMARY = "Software Management"
DESCRIPTION = "The 32bit pattern complementing sw_management."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-sw_management-32bit-20200505-42.1.aarch64.rpm"
RPM_HASH = "5e5b3e8ca1ee2d141705f936411b2218446487a26d1f4cd8ead0f5cf7623c87a3caa7bd55a859e865f28a76c180661f4f0e9fbd22a64c0cdc843089cde5a4f24"

RPROVIDES:${PN} += "pattern- \
patterns-base-sw-management-32bit"

RDEPENDS:${PN} += ""

inherit rpm
