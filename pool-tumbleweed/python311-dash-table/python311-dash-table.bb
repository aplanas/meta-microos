SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-dash-table-5.0.0-1.5.noarch.rpm"
RPM_HASH = "f9c3cce5b7cad624fa5abfce76d82ebe2e182e652026411fe482de7333070e596c7440cf6a6969241600230dcaa1dba419d7857125b4e841897e877918c66ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dash-table \
python311-dash-table \
python3dist-dash-table"

RDEPENDS:${PN} += "python-abi"

inherit rpm
