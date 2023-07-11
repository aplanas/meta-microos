SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-dirty-equals-0.5.0-1.5.noarch.rpm"
RPM_HASH = "52f33ab3568d7f55e38ace8edd22f1346630ca5fa9b3898595e31ee8b2de5949022ec7bf3ad93f64eb25fb97aa7a56158a6a5bd5f9a741d8aeb6c3007b289aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dirty-equals \
python39-dirty-equals \
python3dist-dirty-equals"

RDEPENDS:${PN} += "python-abi \
python39-pytz"

inherit rpm
