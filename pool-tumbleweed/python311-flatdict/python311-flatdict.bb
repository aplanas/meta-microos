SUMMARY = "Python module for interacting with nested dicts"
DESCRIPTION = "Python module for interacting with nested dicts as a single level dict with delimited keys."
LICENSE = "BSD-3-Clause"

PV = "4.0.1"

RPM_NAME = "python311-flatdict-4.0.1-3.8.noarch.rpm"
RPM_HASH = "8c3d49dab65e4bdd06e687eb69b67d686b9efe0465ed70a7f0b86d72cdbd679acd2bf8b921349547d604618926da30493a509eca857d1105abf5fc56a88f944b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flatdict \
python3.11dist-flatdict \
python311-flatdict \
python3dist-flatdict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
