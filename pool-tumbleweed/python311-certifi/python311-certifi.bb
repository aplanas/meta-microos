SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.7.22"

RPM_NAME = "python311-certifi-2023.7.22-1.1.noarch.rpm"
RPM_HASH = "6b0a72002c8d3aca721f6ee987f08f71c07d3c767e21b568f2a765a49c8971ee9b79e0c8b39e509299f730d91ef3b59e6bb69620841e3d7b5821dd9b10822482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certifi \
python3.11dist-certifi \
python311-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python-abi"

inherit rpm
