SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python311-pytest-metadata-2.0.4-2.1.noarch.rpm"
RPM_HASH = "c4906bb814f80c5ad95f01ed1d233d1d62b682b0b855cb2998ee6b63073b33d1892daa7cad4f6ff83cf097e12c47efe534bc141372fa8ca6d4fe49a4f12fff07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-metadata) \
python311-pytest-metadata \
python3dist(pytest-metadata)"
RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
