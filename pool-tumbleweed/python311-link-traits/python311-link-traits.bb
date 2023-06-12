SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-link-traits-1.0.3-1.11.noarch.rpm"
RPM_HASH = "7f928649f4d12570081d9620a3551de6cbcb1b668487dc9afd114197578c923b2c6ab8ee0a148d63a55dc6ffa59ff3b9bc6ce9d50c3a26c7f1fe508a32c717a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(link-traits) \
python311-link-traits \
python3dist(link-traits)"
RDEPENDS:${PN} += "python(abi) \
python311-traits"

inherit rpm
