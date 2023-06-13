SUMMARY = "library to manage Python Locations Table (co_linetable)"
DESCRIPTION = "library to manage Python Locations Table (co_linetable)"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-linetable-0.0.3-1.2.noarch.rpm"
RPM_HASH = "cc028b86ed8d5b5ecce50fbf582ecb8fad4060367b3fd796855c268e8b0cb62365d67f6a465a215b8f93bee0f1e74fb34945ca8e5e017c7e709226f024f3bcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-linetable \
python3.10dist(linetable) \
python310-linetable \
python3dist(linetable)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
