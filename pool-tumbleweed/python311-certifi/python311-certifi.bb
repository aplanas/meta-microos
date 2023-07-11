SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.5.7"

RPM_NAME = "python311-certifi-2023.5.7-1.2.noarch.rpm"
RPM_HASH = "1835cdf576e58fd906dad72006b7b49906a2627d8e320b8ec2e92f5047f6f1492bee35091dfa4788a63e646d8be9937697406bacf028c97f6958531591e8307d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certifi \
python3.11dist-certifi \
python311-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python-abi"

inherit rpm
