SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python311-sphobjinv-2.2.2-1.4.noarch.rpm"
RPM_HASH = "b17a4e4fffaeae2add34ccdc7d4173adc3c02982fd5c00966f49f044fb4587622e012455377ec6fb18d43a8c9bb8efd6e083e1acdfc5443f313c7c9aa34e424e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphobjinv \
python311-sphobjinv \
python3dist-sphobjinv"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
python311-certifi \
python311-jsonschema \
update-alternatives"

inherit rpm
