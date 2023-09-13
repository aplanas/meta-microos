SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.2.0"

RPM_NAME = "python39-pynetbox-7.2.0-1.1.noarch.rpm"
RPM_HASH = "046d19a0f74c1836d59f5b5795d9b88f9049a55d27ff1e8d0b466a9159f3e466301626cf1369e39fbbeb7e7548b1fdc395a0a32efa8ee5949c46c7072a52be64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynetbox \
python39-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-requests"

inherit rpm
