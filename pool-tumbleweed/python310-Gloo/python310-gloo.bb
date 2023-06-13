SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python310-Gloo-0.1.2-3.7.noarch.rpm"
RPM_HASH = "2c7a48c7c40f3d39aa8db30d967fb449ccb1a12f1fe061cd9fe02211897a1828157e611e699f377ef379cf22caa735496f5593a519bfca31841763ca3d5249c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Gloo \
python3.10dist(gloo) \
python310-Gloo \
python3dist(gloo)"

RDEPENDS:${PN} += "python(abi) \
python310-pandas"

inherit rpm
