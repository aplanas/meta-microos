SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python310-infinity-1.5-2.5.noarch.rpm"
RPM_HASH = "d565e21cdff792bdfd170997a77efe0b2a116baa58ca8c7f5d5e2fcb93c419464e5d9a2937919277ecfc4f285165282344bf1c8a878ba27c880266359d524e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-infinity \
python310-infinity \
python3dist-infinity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
