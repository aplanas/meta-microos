SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2023.3"

RPM_NAME = "python39-weblate-schemas-2023.3-1.1.noarch.rpm"
RPM_HASH = "3a350baf180f4d52fa8f9f4f7296c282812c4426fb9815b03060c49116c1b1ade07c765c5e15cf5eb59662e6cb55775146be86085ffb7929dc087d1e2bf3228f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-weblate-schemas \
python39-weblate-schemas \
python3dist-weblate-schemas"

RDEPENDS:${PN} += "python-abi \
python39-jsonschema"

inherit rpm
