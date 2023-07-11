SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-dash-table-5.0.0-1.6.noarch.rpm"
RPM_HASH = "cd95f9e2dedba34d85bdca78bbd1317f65afc65488a9d041ca5b7c0c01eedac9eec9976d643ce64e5aaa80bd2e517a345ea05ce411d64ad92696c4f12132af7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dash-table \
python310-dash-table \
python3dist-dash-table"

RDEPENDS:${PN} += "python-abi"

inherit rpm
