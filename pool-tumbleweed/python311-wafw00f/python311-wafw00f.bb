SUMMARY = "The Web Application Firewall Detection and Fingerprinting Toolkit"
DESCRIPTION = "The Web Application Firewall Detection and Fingerprinting Toolkit."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-wafw00f-2.2.0-1.3.noarch.rpm"
RPM_HASH = "1aee31fe6b81c4b781f2b23633108e5d0fe0d973a410eaa9e43abfab70c4fb61cdea19a63f77f60b0adf85acb385c3aca0cc85b4564d5712e7340a6cd0230f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wafw00f \
python311-wafw00f \
python3dist-wafw00f"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pluginbase \
python311-requests"

inherit rpm
