SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "3.0.0"

RPM_NAME = "python39-pytest-metadata-3.0.0-1.1.noarch.rpm"
RPM_HASH = "1c86a154a7454e1a53a0febfd153c1590beba2948d325f4f1e8f2004e8d8983a930117d39c0bd001175281ae766150d41f233f6386b58949613a68dae4a923d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-metadata \
python39-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
