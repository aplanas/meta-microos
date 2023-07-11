SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2023.3"

RPM_NAME = "python311-weblate-schemas-2023.3-1.1.noarch.rpm"
RPM_HASH = "1dd185985b898559357736422711b446119de4fefb5ab53addf085ba0b4ae5a1e6f95758decca5d0936a57a9df5e62dda07bae2433d7082da8deb3499b158e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblate-schemas \
python3.11dist-weblate-schemas \
python311-weblate-schemas \
python3dist-weblate-schemas"

RDEPENDS:${PN} += "python-abi \
python311-jsonschema"

inherit rpm
