SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2023.3"

RPM_NAME = "python310-weblate-schemas-2023.3-1.1.noarch.rpm"
RPM_HASH = "d80e3c5c30b23b45d8f220946bcc8b9c361c957823dc0c11ca464330132f319d89ed50f3b483b3d13cb2c46541f51a873c60ef9422bb5a3a93f6c06e21d0ba21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-weblate-schemas \
python310-weblate-schemas \
python3dist-weblate-schemas"

RDEPENDS:${PN} += "python-abi \
python310-jsonschema"

inherit rpm
