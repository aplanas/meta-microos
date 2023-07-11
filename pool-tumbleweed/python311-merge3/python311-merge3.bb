SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.12"

RPM_NAME = "python311-merge3-0.0.12-1.5.noarch.rpm"
RPM_HASH = "a22d7d60329b0aa2783f6f4e7665dc56b57d65a647b3315c8dfce2582c3854137f4f4b993bca47a39be5e0df3e806132bb520630143ffea0117e75fab3e22057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-merge3 \
python3.11dist-merge3 \
python311-merge3 \
python3dist-merge3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
