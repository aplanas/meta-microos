SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.7.22"

RPM_NAME = "python39-certifi-2023.7.22-1.1.noarch.rpm"
RPM_HASH = "04ea00fb4ae5484b5f75defda6a6f5b40755b8ebe68d6af82e13a35f5e666d2b92e3e918a9987d7f0e8acf6ec4aa9022cbd9ff3a789923e37ecdb1ecd2e76290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certifi \
python39-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python-abi"

inherit rpm
