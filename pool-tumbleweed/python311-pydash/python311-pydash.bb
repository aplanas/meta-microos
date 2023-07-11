SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python311-pydash-5.1.0-1.8.noarch.rpm"
RPM_HASH = "858a1d9f40f3099feb33ba85cd44653b2ff35164158fa63ca76477008098908bb0e636c67b932004c0966fa00bfbe43adb9824e32b1225820b22d26f45f94129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydash \
python3.11dist-pydash \
python311-pydash \
python3dist-pydash"

RDEPENDS:${PN} += "python-abi"

inherit rpm
