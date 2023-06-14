SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.5.7"

RPM_NAME = "python310-certifi-2023.5.7-1.1.noarch.rpm"
RPM_HASH = "d2ad0e2be2e40dace92cbfb1b54d336c3882ad102d9d1aa0f11710d8be00116b1c8cd9f148c55111a355c7b758ab6a2da2964de335f53e04cf9ef9e60cdb795d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certifi \
python3.10dist-certifi \
python310-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python-abi"

inherit rpm
