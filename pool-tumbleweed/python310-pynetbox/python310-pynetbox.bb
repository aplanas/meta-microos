SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python310-pynetbox-7.1.0-1.1.noarch.rpm"
RPM_HASH = "c1c20926e57e2b4dfaf8362e0dfbbcc878491a4b8795a8df1c594b9cb6dbbed8275cfd31f155be2146e553df1d882f89410849f21561705aaeb0081c7d404c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynetbox \
python310-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-requests"

inherit rpm
