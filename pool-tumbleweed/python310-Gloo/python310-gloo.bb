SUMMARY = "Project management for data analysis projects"
DESCRIPTION = "Gloo ties together a lot of the data analysis actions that happen \
regularly. It automatically loads data into the IPython environment, \
runs scripts, makes utitlity functions available and more."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "python310-Gloo-0.1.2-3.8.noarch.rpm"
RPM_HASH = "e20bff30b1bcb7a260b4d7f38e25e1b23bfb3064938ea48a74297f874cc730071043c580716ef71f4f3c8b2e7c65b6fba0a763dd8056132225d1a2e867cc38a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gloo \
python310-Gloo \
python3dist-gloo"

RDEPENDS:${PN} += "python-abi \
python310-pandas"

inherit rpm
