SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-wafw00f-2.2.0-1.3.noarch.rpm"
RPM_HASH = "2facd7353cfa4c7d5c57c73323b67ce72eaf66682a60113aba418121dac433fb665eedb00b84a33eecb81cf909da395da004b0ac5e35837173004ac8c3a42c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wafw00f \
python3.10dist-wafw00f \
python310-wafw00f \
python3dist-wafw00f"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pluginbase \
python310-requests"

inherit rpm
