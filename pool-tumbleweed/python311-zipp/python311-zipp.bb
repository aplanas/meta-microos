SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "3.15.0"

RPM_NAME = "python311-zipp-3.15.0-2.3.noarch.rpm"
RPM_HASH = "79f81aad0b49eff8723ff4d82197009ca856c4d9b02bffec596ea43dfd055b2406fc653ac0ef95fdb0d2d464d940b97d7f57cc187228e9e4bd618275653d8ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zipp \
python3.11dist-zipp \
python311-zipp \
python3dist-zipp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
