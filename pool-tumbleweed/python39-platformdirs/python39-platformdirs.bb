SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.5.1"

RPM_NAME = "python39-platformdirs-3.5.1-1.3.noarch.rpm"
RPM_HASH = "7edbb9ddb2906e7ecbc61e156eecd902267b8ba78e42786f09054a196247b8f8f4e817ed1eff1ec3e2dbeb74a421cf7a71934d1b8147d9c0c518d732fcce9988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-platformdirs \
python39-platformdirs \
python3dist-platformdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
