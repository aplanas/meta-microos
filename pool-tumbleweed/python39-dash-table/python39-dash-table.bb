SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-dash-table-5.0.0-1.5.noarch.rpm"
RPM_HASH = "6962aa6dbae272f63187b75c9f37e022093310f77ef5d4cf08160a75b3caa8f10a191b53af9afd3737fd0bed86ecb85898041815f6f4b5381aedc3f337d29a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dash-table) \
python39-dash-table \
python3dist(dash-table)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
