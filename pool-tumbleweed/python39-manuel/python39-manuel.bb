SUMMARY = "Python module to build tested documentation"
DESCRIPTION = "Manuel lets the user build tested documentation. \
 \
Documentation, a full list of included plug-ins, and examples are available \
with the -doc package and at http://packages.python.org/manuel/."
LICENSE = "Apache-2.0"

PV = "1.12.4"

RPM_NAME = "python39-manuel-1.12.4-4.2.noarch.rpm"
RPM_HASH = "f2cebb54e3839812c753a34d0a77e0a14dd7bee667f4deff4e12d750181b7a8002083674bc7148695b3694753c63dd5e56c01adc1759a7080d08945948aa4189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-manuel \
python39-manuel \
python3dist-manuel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
