SUMMARY = "Dash table"
DESCRIPTION = "An interactive DataTable for Dash. \
 \
As of Dash 2, the development of dash-table has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-dash-table-5.0.0-1.6.noarch.rpm"
RPM_HASH = "646418d69f1308b9e203650e46c9f239ff1b6662d06256a32a6239027495c5d9b8edbc67ce4187bff3dce14bf0681b1b38caa091efda52af4f1455024a6648d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dash-table \
python39-dash-table \
python3dist-dash-table"

RDEPENDS:${PN} += "python-abi"

inherit rpm
