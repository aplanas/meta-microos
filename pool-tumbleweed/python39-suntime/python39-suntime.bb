SUMMARY = "Python sunset and sunrise time calculation"
DESCRIPTION = "Python sunset and sunrise time calculation library."
LICENSE = "LGPL-3.0-only"

PV = "1.2.5"

RPM_NAME = "python39-suntime-1.2.5-1.16.noarch.rpm"
RPM_HASH = "f0a83bdf00d786a042ce2f257fdf40d50092a301c6f9d7b499d8fa30a7ba24d51dd382bb462eea40fd0aa4f2e472ccfd5b3d1fd48b30717176a2fcda9bd73073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-suntime \
python39-suntime \
python3dist-suntime"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
