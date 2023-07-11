SUMMARY = "A dot-accessible dictionary"
DESCRIPTION = "A dot-accessible dictionary (a la JavaScript objects)."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-munch-3.0.0-1.3.noarch.rpm"
RPM_HASH = "5368b65e5a2c7af665a5ec3dc7c5706ffb0bcf9faa960937dee38edba0c9f60452e13831afdfcf2a89d6462b6894ec053c0222adb1f91a44678669c3f44d1391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-munch \
python39-munch \
python3dist-munch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
