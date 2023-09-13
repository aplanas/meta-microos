SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.2.0"

RPM_NAME = "python311-pynetbox-7.2.0-1.1.noarch.rpm"
RPM_HASH = "e59a5b88eaa0e0574a5a679a759a3c7ac4573bdf35137978e319a6214ef81d14dcbbf3bcb8695edba160bb5f5fc00fb5f2f6bf1903f0ecd283cfaadbe6720c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynetbox \
python3.11dist-pynetbox \
python311-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-requests"

inherit rpm
