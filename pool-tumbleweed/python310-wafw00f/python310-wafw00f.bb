SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-wafw00f-2.2.0-1.5.noarch.rpm"
RPM_HASH = "62c3d2999fa49b40f2016c2edd007c8ed6ba8c817db44b85032e01d9c2f08bc9c8265c1ede36932027ad08f7bdfc0f855c0b2fc06853074ac395fec1556b3ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wafw00f \
python310-wafw00f \
python3dist-wafw00f"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pluginbase \
python310-requests"

inherit rpm
