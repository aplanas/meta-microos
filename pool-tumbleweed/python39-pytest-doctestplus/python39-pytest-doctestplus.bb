SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "python39-pytest-doctestplus-0.13.0-1.1.noarch.rpm"
RPM_HASH = "d340d2687d2edbfdb9ff3b45aea647ec23e646c22f2db74a882760e9c90d6f2db25fd14fe97f9559e046077c4b0f4d782125e0cf27caeb4b9b5deb1abada9015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-doctestplus \
python39-pytest-doctestplus \
python3dist-pytest-doctestplus"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-pytest \
python39-setuptools"

inherit rpm
