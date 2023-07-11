SUMMARY = "Set of helpers for easy testing of Django apps"
DESCRIPTION = "Set of helpers for easy testing of Django apps."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-djet-0.3.0-2.5.noarch.rpm"
RPM_HASH = "77d8a5899e6b6c86bb3b9d3083e122259f75abcdeec92e390ed11afe02cdc10a5c7c76bbdcbfd2360089d323cc111046ba418138012e82411701eeaf37a591c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-djet \
python39-djet \
python3dist-djet"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Pillow \
python39-six"

inherit rpm
