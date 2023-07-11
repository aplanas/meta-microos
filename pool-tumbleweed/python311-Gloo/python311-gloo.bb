SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python311-Gloo-0.1.2-3.8.noarch.rpm"
RPM_HASH = "0715e0c3fd715f4e5c0aa7fa3ffce2fc69539ee22b3b2013674cb5e1822de478fe682df0eb81ded4832857efde3ccc0533807d982d1308c5e58078dde03ffc08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Gloo \
python3.11dist-gloo \
python311-Gloo \
python3dist-gloo"

RDEPENDS:${PN} += "python-abi \
python311-pandas"

inherit rpm
