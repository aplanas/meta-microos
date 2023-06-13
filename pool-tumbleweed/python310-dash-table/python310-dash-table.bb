SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-dash-table-5.0.0-1.5.noarch.rpm"
RPM_HASH = "6833e2bc7cb5a041cb60e50078062177c33915bc613221d926070647304eeaa62674ee125441a791afe666a73b4858122681986a6ad8360982c30c0637522856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-table \
python3.10dist(dash-table) \
python310-dash-table \
python3dist(dash-table)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
