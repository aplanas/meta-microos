SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-link-traits-1.0.3-1.11.noarch.rpm"
RPM_HASH = "0bdcb397f0fcf51308ece1a0022b71edba95b1fbe8ca08042a3a56283a97f1f47b4d61a19e738467b4515d870f5a2608d677ac8e470eeb9077bd282d82199e0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-link-traits \
python3.10dist(link-traits) \
python310-link-traits \
python3dist(link-traits)"

RDEPENDS:${PN} += "python(abi) \
python310-traits"

inherit rpm
