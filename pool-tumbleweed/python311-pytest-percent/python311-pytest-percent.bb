SUMMARY = "Pytest plugin to exit successfully when a required percent of tests pass"
DESCRIPTION = "Change the exit code of pytest test sessions when a required percent of tests pass."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-pytest-percent-0.1.2-1.14.noarch.rpm"
RPM_HASH = "b1e8b3b41b6e2164f1403b3bcb993dca3c8ca830e31fc58394b1a6b75cf7ef5783c8f1263d6708921cf5a9e35c4b4e1357629e35747b9d92045e674683abf683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-percent \
python3.11dist-pytest-percent \
python311-pytest-percent \
python3dist-pytest-percent"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
