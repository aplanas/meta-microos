SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python310-pytest-metadata-2.0.4-2.3.noarch.rpm"
RPM_HASH = "3a1b9774e623d9fdb6381fed947970b3907cc352e9e5608f16935996dac6531b361416c90bc391d653d119f565f009b99d54132f0a1f5acad63cf204c9dcafea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-metadata \
python310-pytest-metadata \
python3dist-pytest-metadata"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
