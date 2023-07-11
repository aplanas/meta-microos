SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-zict-2.2.0-1.5.noarch.rpm"
RPM_HASH = "e15e336681b55b53751c57b140571629e21f3dd252273f507f7ce29dbc48355af8dc7dbde9fb876517926d5a92bc65ca713f53d250010ee383c63eee2b6fa470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zict \
python310-zict \
python3dist-zict"

RDEPENDS:${PN} += "python-abi \
python310-HeapDict"

inherit rpm
