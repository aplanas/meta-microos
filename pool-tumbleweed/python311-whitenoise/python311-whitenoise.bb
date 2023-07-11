SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python311-whitenoise-6.2.0-1.5.noarch.rpm"
RPM_HASH = "f5309e9ac021622164e1a08d39026f58732e60f320e4dbcd62e39d14989c081d28e5afd8240f201278e5df7f184900d5bb253166518112e63bd7989f08e911ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whitenoise \
python3.11dist-whitenoise \
python311-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
