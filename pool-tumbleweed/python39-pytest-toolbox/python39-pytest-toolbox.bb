SUMMARY = "Numerous plugins for pytest"
DESCRIPTION = "Numerous useful plugins for pytest."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-pytest-toolbox-0.4-4.1.noarch.rpm"
RPM_HASH = "94085d8bf0f6ae1d26b31cd30001a906bebbdac44890396e85f92292e1edf63b676e8a92aa1bcb43ec52fa833b3ebedfd2ee9d431366978fa63d40a788430339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-toolbox \
python39-pytest-toolbox \
python3dist-pytest-toolbox"

RDEPENDS:${PN} += "python-abi \
python39-py \
python39-pytest"

inherit rpm
