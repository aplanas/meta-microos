SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python39-Gloo-0.1.2-3.8.noarch.rpm"
RPM_HASH = "4cb9f2414ca69fdbbecf84ea3a4619a23bad17063ff80c34c8b8aa4751d6bd71cdd112f70a489b22cada2121731a1f1841f167eaf3f2227b7c49c1245cdbcdf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gloo \
python39-Gloo \
python3dist-gloo"

RDEPENDS:${PN} += "python-abi \
python39-pandas"

inherit rpm
