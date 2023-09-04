SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.7.22"

RPM_NAME = "python310-certifi-2023.7.22-1.1.noarch.rpm"
RPM_HASH = "737ae6ecb448dc482f67e58121081294ed7e5b2e44c7a1de8c96d3ba21efa300413b9cf2a65f58060f518df803bd0c1dc1a8e38c19bd97b3ad520f3c38ec3a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certifi \
python310-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python-abi"

inherit rpm
