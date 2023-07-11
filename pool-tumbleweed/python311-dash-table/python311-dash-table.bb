SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-dash-table-5.0.0-1.6.noarch.rpm"
RPM_HASH = "39666f6ea5d0162bdc6a6f8ecf0719e4ad5fc15ba1e5743e2ef8f8d8ceea2a5a95774c04d2cafb70ac065696e2c39f6ffcc9ffee4e5b9030af9ac58d4bb9755e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-table \
python3.11dist-dash-table \
python311-dash-table \
python3dist-dash-table"

RDEPENDS:${PN} += "python-abi"

inherit rpm
