SUMMARY = "Python L20n library"
DESCRIPTION = "L20n mozilla markings for translations. \
 \
Better solution today is to use python fluent module."
LICENSE = "Apache-2.0"

PV = "4.0.0a1"

RPM_NAME = "python39-l20n-4.0.0a1-2.3.noarch.rpm"
RPM_HASH = "06ad868448c7e2611182a7c5704ff75f1d3b08e0608658f7d82e609eda193923b4c0e7bfadc16016b499a526b12112bda2167bed37a98ea5a48f6724f10f1d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(l20n) \
python39-l20n \
python3dist(l20n)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
