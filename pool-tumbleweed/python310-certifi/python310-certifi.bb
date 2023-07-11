SUMMARY = "Python package for providing Mozilla's CA Bundle"
DESCRIPTION = "Certifi provides Mozilla's carefully curated collection of Root Certificates \
for validating the trustworthiness of SSL certificates while verifying the \
identity of TLS hosts. It has been extracted from the Requests project. \
 \
Note that on SUSE packages the used CA bundle is actually the system bundle"
LICENSE = "MPL-2.0"

PV = "2023.5.7"

RPM_NAME = "python310-certifi-2023.5.7-1.2.noarch.rpm"
RPM_HASH = "dbf009d539d8c1b835d80e1420ae35a5806e5588852c19e79bfa7a9a04b15579e8310c16fd2b178d417585fd258a4c5256352e0895f395bd93b3027f54c221b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-certifi \
python310-certifi \
python3dist-certifi"

RDEPENDS:${PN} += "ca-certificates \
ca-certificates-mozilla \
python-abi"

inherit rpm
