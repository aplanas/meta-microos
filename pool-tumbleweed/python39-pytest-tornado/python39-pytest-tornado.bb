SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python39-pytest-tornado-0.8.1-2.1.noarch.rpm"
RPM_HASH = "e8dab9700662b08d160630fcaf1a31ed574b944a9c7844c0f9cabb1f6bdf7f9a4bc4ea8ca1cbba069c527075f8868b0893deb98c9de0bda9467f7e39e4310f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-tornado \
python39-pytest-tornado \
python3dist-pytest-tornado"

RDEPENDS:${PN} += "python-abi \
python39-certifi \
python39-pytest \
python39-tornado"

inherit rpm
