SUMMARY = "Small library to dynamically create python functions"
DESCRIPTION = "Small library to dynamically create python functions."
LICENSE = "BSD-3-Clause"

PV = "1.15.1"

RPM_NAME = "python39-makefun-1.15.1-2.4.noarch.rpm"
RPM_HASH = "13f4dcfaf3162adde82bec0d439b84dfc19982903512a5602d05cf266c6df22e59eb34317bccda1ac42de47b75b278958c8dc3fe16494f658bb32d0f5e30c25f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-makefun \
python39-makefun \
python3dist-makefun"

RDEPENDS:${PN} += "python-abi"

inherit rpm
