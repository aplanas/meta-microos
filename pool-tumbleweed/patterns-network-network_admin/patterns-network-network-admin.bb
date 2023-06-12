SUMMARY = "Network Administration"
DESCRIPTION = "Tools for administering and debugging networks."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-network-network_admin-20170319-3.5.aarch64.rpm"
RPM_HASH = "02636a62a941b3dfc6f87fe0d7e79ef1b524073210843357509ffd37d7e5c1a93702acda3f8f064a454fe0d06316e9a1f4e341e9364e32a7ac090d2ed61987a5"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-network-network_admin \
patterns-network-network_admin(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
