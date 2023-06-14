SUMMARY = "Software Management"
DESCRIPTION = "The 32bit pattern complementing sw_management."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-sw_management-32bit-20200505-41.1.aarch64.rpm"
RPM_HASH = "475ecfc6a164b4fa9e0cac7f9bf38dff00533c900cd9ed4c9ca2535c80008515c05b91ad561dc5e9feff19c17092e4246722aff1da60ce3a697dd81431ddf0d2"

RPROVIDES:${PN} += "pattern- \
patterns-base-sw-management-32bit"

RDEPENDS:${PN} += ""

inherit rpm
