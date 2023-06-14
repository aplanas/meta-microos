SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python39-purl-1.6-2.1.noarch.rpm"
RPM_HASH = "4d2bbb50d52aed589b858f9cc5025540d5d4a4954588fbe223453722947ae42d5146f4967c935772a5f3ebb01bec70ce4ced81b24f14e0a74b31c92e55c7e521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-purl \
python39-purl \
python3dist-purl"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
