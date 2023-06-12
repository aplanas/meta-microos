SUMMARY = "Base Development"
DESCRIPTION = "The 32bit pattern complementing devel_basis."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_basis-32bit-20170319-11.2.aarch64.rpm"
RPM_HASH = "4aaea24e523cef6efe65494d3add81a873d446847cc4557ad3208f3156bd8a068bc089fbf15f834545a9da611a6a54bc3d4bbedbb7efa3a174f14410a42f3e97"

RPROVIDES:${PN} += "pattern() \
patterns-devel-base-devel_basis-32bit \
patterns-devel-base-devel_basis-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
