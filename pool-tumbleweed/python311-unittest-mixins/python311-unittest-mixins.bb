SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python311-unittest-mixins-1.6-2.9.noarch.rpm"
RPM_HASH = "84a003d93517c1601b14aae56a920ccd73fa0ae86568ceec1dd962fa896661e4549a07a8d4cd4a65e39edebaa31f7764401f00202eee90912a6752545efaf5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unittest-mixins \
python3.11dist-unittest-mixins \
python311-unittest-mixins \
python3dist-unittest-mixins"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
