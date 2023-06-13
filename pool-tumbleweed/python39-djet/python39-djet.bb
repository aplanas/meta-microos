SUMMARY = "Set of helpers for easy testing of Django apps"
DESCRIPTION = "Set of helpers for easy testing of Django apps."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-djet-0.3.0-2.3.noarch.rpm"
RPM_HASH = "4bb8af6eb53a40b5f196a392794431ac4ab410478952907d151d92b740b9b946679587624c3db0e405978a459501b06226c6ed7c94581bed4f5940b9fb55b43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(djet) \
python39-djet \
python3dist(djet)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-Pillow \
python39-six"

inherit rpm
