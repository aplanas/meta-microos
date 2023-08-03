SUMMARY = "Pytest plugin to add environment variables"
DESCRIPTION = "A py.test plugin that allows you to add environment variables."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python39-pytest-env-0.8.2-1.1.noarch.rpm"
RPM_HASH = "e8fee935025ed51e802d33f0b2a23b4f37d1c3f302103db8da151a736fb2d200ead7bb4259295811823fc28b0530032839502e0ffc780b2daf0e7c84e5a8d79d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-env \
python39-pytest-env \
python3dist-pytest-env"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
