SUMMARY = "Backports of the linecache module"
DESCRIPTION = "A backport of linecache to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python311-linecache2-1.0.0-6.3.noarch.rpm"
RPM_HASH = "703d25497b348934a11b08b463db96abc09fb089b950162a67893fced5e64dfb2d7265701f9e2b9a2f46960d6e004d074281e3b3ddc4d660c764fd33ffaf2316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linecache2 \
python3.11dist-linecache2 \
python311-linecache2 \
python3dist-linecache2"

RDEPENDS:${PN} += "python-abi \
python311-pbr"

inherit rpm
