SUMMARY = "Fixture configuration utils for pytest"
DESCRIPTION = "Fixture configuration utilities for pytest"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-fixture-config-1.7.0-4.3.noarch.rpm"
RPM_HASH = "bd212e927b84e7885ace90bf55af5acb6666dbe124a2148e85109ab827d46063cad61106b05c655559928da214d3ae34663d0f1f69f5f8fc3992af55dd0f2a83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-fixture-config \
python310-pytest-fixture-config \
python3dist-pytest-fixture-config"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
