SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python310-sphobjinv-2.2.2-1.4.noarch.rpm"
RPM_HASH = "f2b80b1f624105706298610217da2ffc37eafcb11ff7c86e5ae6f901ec7304f787949f4a8762f6b2a90b1aad05014554df8ed0e449dc8f51f490f298be242abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphobjinv \
python3.10dist-sphobjinv \
python310-sphobjinv \
python3dist-sphobjinv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
python310-certifi \
python310-jsonschema \
update-alternatives"

inherit rpm
