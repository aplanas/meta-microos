SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-wafw00f-2.2.0-1.5.noarch.rpm"
RPM_HASH = "435eff1c8ac4b0b4bf482b288dab6f5aa2cfdc4922b5c6d8e5f39c844cdf69db76f1bb001444491dc790a97eea3494ed0db4bb8b7fdabcb111f689482f545de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wafw00f \
python39-wafw00f \
python3dist-wafw00f"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pluginbase \
python39-requests"

inherit rpm
