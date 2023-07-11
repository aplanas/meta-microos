SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-promise-2.3.0-4.3.noarch.rpm"
RPM_HASH = "78def1e983d6a637315a1f0807356abaa159362a3b1a40699ad7dcb61315d2021c5466f3ba28a01bdecc5e2d48c271cec6e5ff620a9ca7ba2fce65ef682ddf04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-promise \
python310-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
