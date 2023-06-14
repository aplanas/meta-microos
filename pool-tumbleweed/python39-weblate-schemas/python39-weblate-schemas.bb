SUMMARY = "A collection of schemas used by Weblate"
DESCRIPTION = "This module contains schemas used in Weblate exports."
LICENSE = "MIT"

PV = "2022.1"

RPM_NAME = "python39-weblate-schemas-2022.1-1.3.noarch.rpm"
RPM_HASH = "44222ae30d98fb5753faf335e9d1c1d3227cf981c85bb8baf579ac42ac80481631e1c978ae9d40dd2e3174662de1d379c8c2c15b660b094479a4866ac2395cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-weblate-schemas \
python39-weblate-schemas \
python3dist-weblate-schemas"

RDEPENDS:${PN} += "python-abi \
python39-jsonschema"

inherit rpm
