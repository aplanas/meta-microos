SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-wafw00f-2.2.0-1.5.noarch.rpm"
RPM_HASH = "9ab0ecf0bb5c4153548a5886812fa7662c0e1abe689a07adc67789df358cc4869fbd103148f947b10c902e2cc9acd4149cc75f69ddda9388a182200bc2048169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wafw00f \
python3.11dist-wafw00f \
python311-wafw00f \
python3dist-wafw00f"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pluginbase \
python311-requests"

inherit rpm
